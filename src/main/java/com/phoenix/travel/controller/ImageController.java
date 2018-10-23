package com.phoenix.travel.controller;

import com.phoenix.travel.common.consts.GlobalConstants;
import com.phoenix.travel.common.enums.RspCodeEnum;
import com.phoenix.travel.common.exception.TravelBizRuntimeException;
import com.phoenix.travel.common.model.TravelResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * 图片
 *
 * @author Weishuo Zhang
 * @create 2018/10/17
 */
@RestController
@RequestMapping("/image")
public class ImageController {

    private static Logger logger = LoggerFactory.getLogger(ImageController.class);

    private static final String IMG_TYPE_JPG = "jpeg";
    private static final String IMG_TYPE_PNG = "png";


    /**
     * 图片上传
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public TravelResult upload(@RequestParam MultipartFile file) throws IOException {
        if (file.isEmpty() || StringUtils.isBlank(file.getOriginalFilename())) {
            throw new TravelBizRuntimeException(RspCodeEnum.IMG_NOT_EMPTY.getCode());
        }

        String contentType = file.getContentType();
        if (!contentType.contains(IMG_TYPE_JPG) && !contentType.contains(IMG_TYPE_PNG)) {
            throw new TravelBizRuntimeException(RspCodeEnum.IMG_FORMAT_INVALID.getCode());
        }

        String fileName = file.getOriginalFilename();
        logger.info("上传图片[{}]，类型[{}]", fileName, contentType);

        return TravelResult.ok(saveImage(GlobalConstants.IMAGE_BASE_PATH, file));
    }


    private String saveImage(String path, MultipartFile multipartFile) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
        }

        ByteArrayInputStream fileInputStream = (ByteArrayInputStream) multipartFile.getInputStream();
        String fileName = DigestUtils.md5Hex(multipartFile.getOriginalFilename()) + ".jpg";

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + File.separator + fileName));
        byte[] bs = new byte[1024];
        int len;
        while ((len = fileInputStream.read(bs)) != -1) {
            bos.write(bs, 0, len);
        }
        bos.flush();
        bos.close();

        return fileName;
    }


}

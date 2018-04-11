package cn.wallance.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.wallance.dao.IUserDao;
import cn.wallance.domain.User;


@Service("userService")
public class UserServiceImpl implements IUserService {
	private IUserDao userDao;
	
	
	public IUserDao getUserDao() {
		return userDao;
	}

    @Resource
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}


	@Override
	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

}

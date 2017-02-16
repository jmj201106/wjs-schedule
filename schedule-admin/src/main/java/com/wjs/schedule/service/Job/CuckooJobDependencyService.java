package com.wjs.schedule.service.Job;

import java.util.List;

import com.wjs.schedule.domain.exec.CuckooJobDetail;
import com.wjs.schedule.exception.JobDependencyException;
import com.wjs.schedule.vo.job.JobDependency;

public interface CuckooJobDependencyService {

	/**
	 * 设置依赖
	 */
	public void setDependencyJobConfig(List<JobDependency> dependencyJobs);

	/**
	 * 检查任务依赖状态
	 * @param jobInfo
	 * @param data
	 */
	public void checkDepedencyJobFinished(CuckooJobDetail jobInfo) throws JobDependencyException;
}

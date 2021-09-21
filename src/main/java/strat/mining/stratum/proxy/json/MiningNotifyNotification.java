/**
 * stratum-proxy is a proxy supporting the crypto-currency stratum pool mining
 * protocol.
 * Copyright (C) 2014-2015  Stratehm (stratehm@hotmail.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with multipool-stats-backend. If not, see <http://www.gnu.org/licenses/>.
 * https://github-wiki-see.page/m/nicehash/sgminer/wiki/Sia-stratum-protocol
 */
package strat.mining.stratum.proxy.json;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MiningNotifyNotification extends JsonRpcNotification {

	public static final String METHOD_NAME = "mining.notify";

	@JsonIgnore
	private String jobId;
	@JsonIgnore
	private String previousHash;
	@JsonIgnore
	private String merkeleroot;
	@JsonIgnore
	private String witnessroot;
	@JsonIgnore
	private String treeroot;
	@JsonIgnore
	private String reserveroot;
	@JsonIgnore
	private String blockversion;
	@JsonIgnore
	private String networkDifficultyBits;
	@JsonIgnore
	private String currentNTime;
	@JsonIgnore
	private Boolean cleanJobs;
		
	public MiningNotifyNotification() {
		super(METHOD_NAME);
	}

	public MiningNotifyNotification(JsonRpcNotification notification) {
		super(notification);
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public String getmerkeleroot() {
		return merkeleroot;
	}

	public void setmerkeleroot(String merkeleroot) {
		this.merkeleroot = merkeleroot;
	}

	public String getwitnessroot() {
		return witnessroot;
	}

	public void setwitnessroot(String witnessroot) {
		this.witnessroot = witnessroot;
	}

	public String gettreeroot() {
		return treeroot;
	}

	public void settreeroot(String treeroot) {
		this.treeroot = treeroot;
	}

	public String getreserveroot() {
		return reserveroot;
	}

	public void setreserveroot(String reserveroot) {
		this.reserveroot = reserveroot;
	}

	
	public String getblockversion() {
		return blockversion;
	}

	public void setblockversion(String blockversion) {
		this.blockversion = blockversion;
	}
	
	public String getNetworkDifficultyBits() {
		return networkDifficultyBits;
	}

	public void setNetworkDifficultyBits(String networkDifficultyBits) {
		this.networkDifficultyBits = networkDifficultyBits;
	}

	public String getCurrentNTime() {
		return currentNTime;
	}

	public void setCurrentNTime(String currentNTime) {
		this.currentNTime = currentNTime;
	}

	public Boolean getCleanJobs() {
		return cleanJobs;
	}

	public void setCleanJobs(Boolean cleanJobs) {
		this.cleanJobs = cleanJobs;
	}

	@Override
	public List<Object> getParams() {
		if (super.getParams() == null) {
			List<Object> params = new ArrayList<Object>();
			super.setParams(params);
			params.add(jobId);
			params.add(previousHash);
			params.add(merkeleroot);
			params.add(witnessroot);
			params.add(treeroot);
			params.add(reserveroot);
			params.add(blockversion);
			params.add(networkDifficultyBits);
			params.add(currentNTime);
			params.add(cleanJobs);
	}
		return super.getParams();
	}

	@Override
	public void setParams(List<Object> params) {
		super.setParams(params);
		if (params != null) {
			jobId = getParamsObjectAtIndex(0);
			previousHash = getParamsObjectAtIndex(1);
			merkeleroot = getParamsObjectAtIndex(2);
			witnessroot = getParamsObjectAtIndex(3);
			treeroot = getParamsObjectAtIndex(4);
			reserveroot = getParamsObjectAtIndex(5);
			blockversion = getParamsObjectAtIndex(6);
			networkDifficultyBits = getParamsObjectAtIndex(7);
			currentNTime = getParamsObjectAtIndex(8);
			cleanJobs = getParamsObjectAtIndex(9);
			}
	}
}

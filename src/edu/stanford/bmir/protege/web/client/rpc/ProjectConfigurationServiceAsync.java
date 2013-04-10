package edu.stanford.bmir.protege.web.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.stanford.bmir.protege.web.client.rpc.data.ProjectType;
import edu.stanford.bmir.protege.web.client.rpc.data.layout.ProjectLayoutConfiguration;

import java.util.List;

public interface ProjectConfigurationServiceAsync {

	void getProjectLayoutConfiguration(String projectName, String userName, AsyncCallback<ProjectLayoutConfiguration> cb);

	void saveProjectLayoutConfiguration(String projectName, String userName, ProjectLayoutConfiguration config, AsyncCallback<Void> cb);

}
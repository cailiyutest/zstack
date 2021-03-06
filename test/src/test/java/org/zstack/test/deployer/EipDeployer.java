package org.zstack.test.deployer;

import org.zstack.test.ApiSenderException;
import org.zstack.test.deployer.schema.DeployerConfig;

import java.util.List;

/**
 */
public interface EipDeployer<T> extends AbstractDeployer<T> {
    void deploy(List<T> eips, DeployerConfig config, Deployer deployer1) throws ApiSenderException;
}

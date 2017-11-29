def can_build(plat):
	return plat=="android"

def configure(env):
	if (env['platform'] == 'android'):
		env.android_add_java_dir("android/src")
		env.android_add_dependency("compile fileTree(dir: '../../../modules/app2top/android/libs', include: '*.jar')")

package defpackage;

import android.content.Intent;
import com.lumi.singularity.system.TweakService;
import com.lumi.singularity.ui.activities.TweaksActivity;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public interface rw0 {
    static void a(rw0 rw0Var, String str) {
        TweaksActivity tweaksActivity = (TweaksActivity) rw0Var;
        tweaksActivity.getClass();
        Intent intent = new Intent(tweaksActivity, (Class<?>) TweakService.class);
        intent.setAction(str);
        tweaksActivity.startService(intent);
    }

    void finish();
}

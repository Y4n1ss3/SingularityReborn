package com.lumi.singularity.ui.activities;

import android.os.Bundle;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.ek;
import defpackage.f8;
import defpackage.vu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AppsActivity extends vu0 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(-1364334418, true, new f8(getIntent().getBooleanExtra("is_rooted", false), 0)));
    }
}

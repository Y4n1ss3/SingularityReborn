package com.lumi.singularity.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.lumi.singularity.system.DnsBlockerService;
import com.lumi.singularity.system.TweakService;
import com.lumi.singularity.ui.activities.TweaksActivity;
import defpackage.ek;
import defpackage.m70;
import defpackage.rw0;
import defpackage.u1;
import defpackage.v1;
import defpackage.vu0;
import defpackage.y1;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TweaksActivity extends vu0 implements rw0 {
    public static final /* synthetic */ int C = 0;
    public final y1 A;
    public final y1 B;
    public final MutableState v;
    public final MutableState w;
    public final MutableState x;
    public final MutableState y;
    public boolean z;

    public TweaksActivity() {
        Boolean bool = Boolean.FALSE;
        int i = 2;
        this.v = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.w = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.x = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.y = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        final int i2 = 0;
        this.A = g(new v1(i), new u1(this) { // from class: sw0
            public final /* synthetic */ TweaksActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.u1
            public final void a(Object obj) {
                int i3 = i2;
                TweaksActivity tweaksActivity = this.b;
                t1 t1Var = (t1) obj;
                switch (i3) {
                    case 0:
                        int i4 = TweaksActivity.C;
                        if (t1Var.d == -1) {
                            Intent action = new Intent(tweaksActivity, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_START);
                            action.getClass();
                            tweaksActivity.startService(action);
                            break;
                        }
                        break;
                    default:
                        int i5 = TweaksActivity.C;
                        if (t1Var.d == -1) {
                            tweaksActivity.w.setValue(Boolean.TRUE);
                            MutableState mutableState = tweaksActivity.v;
                            Boolean bool2 = Boolean.FALSE;
                            mutableState.setValue(bool2);
                            tweaksActivity.x.setValue(bool2);
                            Intent intent = t1Var.e;
                            int intExtra = intent != null ? intent.getIntExtra("RED", 255) : 255;
                            int intExtra2 = intent != null ? intent.getIntExtra("GREEN", 255) : 255;
                            int intExtra3 = intent != null ? intent.getIntExtra("BLUE", 255) : 255;
                            Intent intent2 = new Intent(tweaksActivity, (Class<?>) TweakService.class);
                            intent2.setAction("com.lumi.singularity.START_CUSTOM_LED");
                            intent2.putExtra("RED", intExtra);
                            intent2.putExtra("GREEN", intExtra2);
                            intent2.putExtra("BLUE", intExtra3);
                            tweaksActivity.startService(intent2);
                            break;
                        }
                        break;
                }
            }
        });
        v1 v1Var = new v1(i);
        final int i3 = 1;
        this.B = g(v1Var, new u1(this) { // from class: sw0
            public final /* synthetic */ TweaksActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.u1
            public final void a(Object obj) {
                int i32 = i3;
                TweaksActivity tweaksActivity = this.b;
                t1 t1Var = (t1) obj;
                switch (i32) {
                    case 0:
                        int i4 = TweaksActivity.C;
                        if (t1Var.d == -1) {
                            Intent action = new Intent(tweaksActivity, (Class<?>) DnsBlockerService.class).setAction(DnsBlockerService.ACTION_START);
                            action.getClass();
                            tweaksActivity.startService(action);
                            break;
                        }
                        break;
                    default:
                        int i5 = TweaksActivity.C;
                        if (t1Var.d == -1) {
                            tweaksActivity.w.setValue(Boolean.TRUE);
                            MutableState mutableState = tweaksActivity.v;
                            Boolean bool2 = Boolean.FALSE;
                            mutableState.setValue(bool2);
                            tweaksActivity.x.setValue(bool2);
                            Intent intent = t1Var.e;
                            int intExtra = intent != null ? intent.getIntExtra("RED", 255) : 255;
                            int intExtra2 = intent != null ? intent.getIntExtra("GREEN", 255) : 255;
                            int intExtra3 = intent != null ? intent.getIntExtra("BLUE", 255) : 255;
                            Intent intent2 = new Intent(tweaksActivity, (Class<?>) TweakService.class);
                            intent2.setAction("com.lumi.singularity.START_CUSTOM_LED");
                            intent2.putExtra("RED", intExtra);
                            intent2.putExtra("GREEN", intExtra2);
                            intent2.putExtra("BLUE", intExtra3);
                            tweaksActivity.startService(intent2);
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final MutableState h() {
        return this.w;
    }

    public final MutableState i() {
        return this.x;
    }

    public final MutableState j() {
        return this.v;
    }

    @Override // defpackage.vu0, defpackage.dk, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ek.a(this, ComposableLambdaKt.composableLambdaInstance(-993553266, true, new m70(getIntent().hasExtra("is_rooted"), getIntent().getBooleanExtra("is_rooted", false), this, 2)));
    }
}

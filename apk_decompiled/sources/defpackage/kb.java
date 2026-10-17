package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class kb {
    public static final ni0 a = new ni0("^[vV]?(\\d+(?:\\.\\d+)*)");

    public static final void a(String str, String str2, my myVar, Composer composer, int i) {
        int i2;
        myVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(1825148087);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1825148087, i2, -1, "com.lumi.singularity.ui.activities.AppCard (AppsActivity.kt:1450)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1553714043, true, new b9(myVar, str, str2, i3), startRestartGroup, 54), startRestartGroup, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 2, str, str2, myVar));
        }
    }

    public static final void b(String str, String str2, String str3, my myVar, Composer composer, int i) {
        int i2;
        long m1765getOnSurfaceVariant0d7_KjU;
        str3.getClass();
        myVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(-906974552);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? Fields.CameraDistance : Fields.RotationZ;
        }
        if (startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-906974552, i2, -1, "com.lumi.singularity.ui.activities.AppCard (AppsActivity.kt:1473)");
            }
            if (ks0.c0(str3, "Installed", false)) {
                startRestartGroup.startReplaceGroup(275823535);
                m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).m1772getPrimary0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else if (ks0.c0(str3, "Update Available", false)) {
                startRestartGroup.startReplaceGroup(275826224);
                m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).m1791getTertiary0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else if (ks0.c0(str3, "Starting", false) || ks0.c0(str3, "Processing", false)) {
                startRestartGroup.startReplaceGroup(275830168);
                m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).m1765getOnSurfaceVariant0d7_KjU();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(275833144);
                m1765getOnSurfaceVariant0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).m1765getOnSurfaceVariant0d7_KjU();
                startRestartGroup.endReplaceGroup();
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1301167898, true, new l9(str3, m1765getOnSurfaceVariant0d7_KjU, myVar, str, str2), startRestartGroup, 54), startRestartGroup, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p2(str, str2, str3, myVar, i, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(boolean z, my myVar, Composer composer, int i, int i2) {
        boolean z2;
        int i3;
        my myVar2;
        boolean z3;
        my myVar3;
        Composer composer2;
        String str;
        Object obj;
        int i4;
        int i5;
        SharedPreferences sharedPreferences;
        un unVar;
        MutableState mutableState;
        MutableState mutableState2;
        ky kyVar;
        int i6;
        SnapshotMutationPolicy snapshotMutationPolicy;
        MutableState mutableState3;
        Activity activity;
        Object obj2;
        Object f4Var;
        PackageManager packageManager;
        SnapshotMutationPolicy snapshotMutationPolicy2;
        ArrayList arrayList;
        SnapshotStateMap snapshotStateMap;
        SnackbarHostState snackbarHostState;
        Activity activity2;
        final MutableState mutableState4;
        final MutableState mutableState5;
        int i7;
        w01 w01Var;
        Object qaVar;
        int i8;
        Context context;
        Composer.Companion companion;
        boolean z4;
        SharedPreferences sharedPreferences2;
        final MutableState mutableState6;
        SnackbarHostState snackbarHostState2;
        final MutableState mutableState7;
        Object l8Var;
        un unVar2;
        SharedPreferences sharedPreferences3;
        SnapshotStateMap snapshotStateMap2;
        final MutableState mutableState8;
        final PackageManager packageManager2;
        ky kyVar2;
        ky kyVar3;
        final ArrayList arrayList2;
        final SnapshotStateMap snapshotStateMap3;
        final ky kyVar4;
        final MutableState mutableState9;
        un unVar3;
        Context context2;
        MutableState mutableState10;
        MutableState mutableState11;
        int i9;
        my myVar4;
        SharedPreferences sharedPreferences4;
        MutableState mutableState12;
        MutableState mutableState13;
        MutableState mutableState14;
        MutableState mutableState15;
        int i10;
        Activity activity3;
        SnackbarHostState snackbarHostState3;
        ky kyVar5;
        Composer composer3;
        MutableState mutableState16;
        ky kyVar6;
        Activity activity4;
        String str2;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-1139421088);
        int i12 = i2 & 1;
        int i13 = 2;
        if (i12 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = i | (startRestartGroup.changed(z2) ? 4 : 2);
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                myVar2 = myVar;
                if (startRestartGroup.changedInstance(myVar2)) {
                    i11 = 32;
                    i3 |= i11;
                }
            } else {
                myVar2 = myVar;
            }
            i11 = 16;
            i3 |= i11;
        } else {
            myVar2 = myVar;
        }
        int i14 = 0;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.startDefaults();
            hm hmVar = null;
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if (i12 != 0) {
                    z2 = true;
                }
                if ((i2 & 2) != 0) {
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new t9(i13, i14, hmVar);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    i3 &= -113;
                    myVar2 = (my) rememberedValue;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1139421088, i3, -1, "com.lumi.singularity.ui.activities.AppsScreen (AppsActivity.kt:133)");
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            un unVar4 = (un) rememberedValue2;
            Context context3 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new SnackbarHostState();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            SnackbarHostState snackbarHostState4 = (SnackbarHostState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState17 = (MutableState) rememberedValue4;
            boolean changedInstance = startRestartGroup.changedInstance(unVar4);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion2.getEmpty()) {
                rememberedValue5 = new c9(unVar4, mutableState17, snackbarHostState4, i14);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ky kyVar7 = (ky) rememberedValue5;
            Activity activity5 = context3 instanceof Activity ? (Activity) context3 : null;
            PackageManager packageManager3 = context3.getPackageManager();
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion2.getEmpty()) {
                rememberedValue6 = context3.getSharedPreferences("singularity_prefs", 0);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            SharedPreferences sharedPreferences5 = (SharedPreferences) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion2.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final MutableState mutableState18 = (MutableState) rememberedValue7;
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == companion2.getEmpty()) {
                rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState19 = (MutableState) rememberedValue8;
            List E = y80.E("com.oculus", "com.meta", "com.google", "com.facebook", "com.environment", "com.lumi.singularity", "com.topjohnwu.magisk", "com.singularity.magisk");
            String string = sharedPreferences5.getString("start_app_on_boot", "");
            String str3 = string == null ? "" : string;
            if (!ds0.n0(str3) && !E.isEmpty()) {
                Iterator it = E.iterator();
                while (it.hasNext()) {
                    String str4 = str3;
                    if (ks0.c0(str4, (String) it.next(), false)) {
                        sharedPreferences5.edit().remove("start_app_on_boot").apply();
                        str = "";
                        break;
                    }
                    str3 = str4;
                }
            }
            str = str3;
            Object[] objArr = new Object[0];
            boolean changed = startRestartGroup.changed(str);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            int i15 = 5;
            if (changed || rememberedValue9 == Composer.Companion.getEmpty()) {
                rememberedValue9 = new i2(str, i15);
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState20 = (MutableState) RememberSaveableKt.rememberSaveable(objArr, (iy) rememberedValue9, startRestartGroup, 0);
            Object[] objArr2 = new Object[0];
            boolean changedInstance2 = startRestartGroup.changedInstance(sharedPreferences5);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == Composer.Companion.getEmpty()) {
                rememberedValue10 = new k8(sharedPreferences5, 0);
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState21 = (MutableState) RememberSaveableKt.rememberSaveable(objArr2, (iy) rememberedValue10, startRestartGroup, 0);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            Object empty = companion3.getEmpty();
            boolean z5 = z2;
            ut utVar = ut.d;
            if (rememberedValue11 == empty) {
                i4 = i3;
                i5 = 2;
                MutableState mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(utVar, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default);
                obj = mutableStateOf$default;
            } else {
                obj = rememberedValue11;
                i4 = i3;
                i5 = 2;
            }
            MutableState mutableState22 = (MutableState) obj;
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == companion3.getEmpty()) {
                MutableState mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i5, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue12 = mutableStateOf$default2;
            }
            MutableState mutableState23 = (MutableState) rememberedValue12;
            boolean changed2 = startRestartGroup.changed(mutableState20) | startRestartGroup.changedInstance(sharedPreferences5) | startRestartGroup.changedInstance(unVar4);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue13 == companion3.getEmpty()) {
                x4 x4Var = new x4(sharedPreferences5, unVar4, mutableState20, mutableState19, 1);
                sharedPreferences = sharedPreferences5;
                unVar = unVar4;
                mutableState = mutableState20;
                mutableState2 = mutableState19;
                startRestartGroup.updateRememberedValue(x4Var);
                rememberedValue13 = x4Var;
            } else {
                mutableState = mutableState20;
                sharedPreferences = sharedPreferences5;
                unVar = unVar4;
                mutableState2 = mutableState19;
            }
            ky kyVar8 = (ky) rememberedValue13;
            Object rememberedValue14 = startRestartGroup.rememberedValue();
            if (rememberedValue14 == companion3.getEmpty()) {
                rememberedValue14 = new cb(4, (hm) null);
                startRestartGroup.updateRememberedValue(rememberedValue14);
            }
            b8 b8Var = new b8("Install APK", "Use the Android file manager to select and install an APK file from your device", "com.lumi.singularity.localapkinstaller", (oy) rememberedValue14, null, null, 96);
            Object rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == companion3.getEmpty()) {
                kyVar = kyVar8;
                rememberedValue15 = new ta(4, null);
                startRestartGroup.updateRememberedValue(rememberedValue15);
            } else {
                kyVar = kyVar8;
            }
            List E2 = y80.E(b8Var, new b8("Vector Manager", "Manager app for the Vector Xposed framework. Bundled inside Vector's own module release, not published as a standalone APK.", "org.matrix.vector.manager", (oy) rememberedValue15, "JingMatrix", "Vector", 16));
            Object rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == companion3.getEmpty()) {
                i6 = 2;
                snapshotMutationPolicy = null;
                rememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(utVar, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue16);
            } else {
                i6 = 2;
                snapshotMutationPolicy = null;
            }
            MutableState mutableState24 = (MutableState) rememberedValue16;
            Object rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == companion3.getEmpty()) {
                rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue17);
            }
            final MutableState mutableState25 = (MutableState) rememberedValue17;
            Object rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == companion3.getEmpty()) {
                rememberedValue18 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy, i6, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue18);
            }
            MutableState mutableState26 = (MutableState) rememberedValue18;
            ArrayList A0 = yi.A0(E2, (List) mutableState24.getValue());
            Object rememberedValue19 = startRestartGroup.rememberedValue();
            if (rememberedValue19 == companion3.getEmpty()) {
                SnapshotStateMap mutableStateMapOf = SnapshotStateKt.mutableStateMapOf();
                int size = A0.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj3 = A0.get(i16);
                    int i17 = i16 + 1;
                    b8 b8Var2 = (b8) obj3;
                    MutableState mutableState27 = mutableState26;
                    String str5 = b8Var2.c;
                    packageManager3.getClass();
                    String p = p(n(str5, packageManager3));
                    int i18 = size;
                    if (p != null) {
                        activity4 = activity5;
                        str2 = uo.d("Installed (v", p, ")");
                    } else {
                        activity4 = activity5;
                        str2 = "Ready";
                    }
                    mutableStateMapOf.put(b8Var2.c, new e8(24, str2, p));
                    size = i18;
                    i16 = i17;
                    mutableState26 = mutableState27;
                    activity5 = activity4;
                }
                mutableState3 = mutableState26;
                activity = activity5;
                startRestartGroup.updateRememberedValue(mutableStateMapOf);
                obj2 = mutableStateMapOf;
            } else {
                mutableState3 = mutableState26;
                activity = activity5;
                obj2 = rememberedValue19;
            }
            SnapshotStateMap snapshotStateMap4 = (SnapshotStateMap) obj2;
            List list = (List) mutableState24.getValue();
            boolean changedInstance3 = startRestartGroup.changedInstance(packageManager3);
            Object rememberedValue20 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue20 == Composer.Companion.getEmpty()) {
                f4Var = new f4(mutableState24, snapshotStateMap4, packageManager3, (hm) null, 2);
                packageManager = packageManager3;
                snapshotMutationPolicy2 = null;
                startRestartGroup.updateRememberedValue(f4Var);
            } else {
                f4Var = rememberedValue20;
                packageManager = packageManager3;
                snapshotMutationPolicy2 = null;
            }
            EffectsKt.LaunchedEffect(list, (my) f4Var, startRestartGroup, 0);
            List list2 = (List) mutableState24.getValue();
            boolean changedInstance4 = startRestartGroup.changedInstance(A0) | startRestartGroup.changedInstance(context3);
            Object rememberedValue21 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue21 == Composer.Companion.getEmpty()) {
                rememberedValue21 = new x2(A0, snapshotStateMap4, context3, mutableState24, (hm) null);
                arrayList = A0;
                snapshotStateMap = snapshotStateMap4;
                startRestartGroup.updateRememberedValue(rememberedValue21);
            } else {
                arrayList = A0;
                snapshotStateMap = snapshotStateMap4;
            }
            EffectsKt.LaunchedEffect(list2, (my) rememberedValue21, startRestartGroup, 0);
            boolean changedInstance5 = startRestartGroup.changedInstance(packageManager);
            Object rememberedValue22 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue22 == Composer.Companion.getEmpty()) {
                rememberedValue22 = new g(1, packageManager, snapshotStateMap);
                startRestartGroup.updateRememberedValue(rememberedValue22);
            }
            ky kyVar9 = (ky) rememberedValue22;
            boolean changedInstance6 = startRestartGroup.changedInstance(context3);
            Object rememberedValue23 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue23 == Composer.Companion.getEmpty()) {
                MutableState mutableState28 = mutableState3;
                rememberedValue23 = new ma(context3, mutableState28, mutableState25, mutableState24, null, 1);
                snackbarHostState = snackbarHostState4;
                activity2 = activity;
                mutableState4 = mutableState28;
                mutableState5 = mutableState24;
                startRestartGroup.updateRememberedValue(rememberedValue23);
            } else {
                snackbarHostState = snackbarHostState4;
                activity2 = activity;
                mutableState5 = mutableState24;
                mutableState4 = mutableState3;
            }
            w01 w01Var2 = w01.a;
            EffectsKt.LaunchedEffect(w01Var2, (my) rememberedValue23, startRestartGroup, 6);
            Object rememberedValue24 = startRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue24 == companion4.getEmpty()) {
                i7 = 2;
                rememberedValue24 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(utVar, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue24);
            } else {
                i7 = 2;
            }
            final MutableState mutableState29 = (MutableState) rememberedValue24;
            Object rememberedValue25 = startRestartGroup.rememberedValue();
            SnapshotStateMap snapshotStateMap5 = snapshotStateMap;
            if (rememberedValue25 == companion4.getEmpty()) {
                rememberedValue25 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue25);
            }
            final MutableState mutableState30 = (MutableState) rememberedValue25;
            Object rememberedValue26 = startRestartGroup.rememberedValue();
            if (rememberedValue26 == companion4.getEmpty()) {
                rememberedValue26 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue26);
            }
            MutableState mutableState31 = (MutableState) rememberedValue26;
            Object rememberedValue27 = startRestartGroup.rememberedValue();
            if (rememberedValue27 == companion4.getEmpty()) {
                rememberedValue27 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue27);
            }
            MutableState mutableState32 = (MutableState) rememberedValue27;
            Object rememberedValue28 = startRestartGroup.rememberedValue();
            if (rememberedValue28 == companion4.getEmpty()) {
                rememberedValue28 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue28);
            }
            MutableState mutableState33 = (MutableState) rememberedValue28;
            Object rememberedValue29 = startRestartGroup.rememberedValue();
            if (rememberedValue29 == companion4.getEmpty()) {
                rememberedValue29 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(utVar, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue29);
            }
            final MutableState mutableState34 = (MutableState) rememberedValue29;
            Object rememberedValue30 = startRestartGroup.rememberedValue();
            if (rememberedValue30 == companion4.getEmpty()) {
                rememberedValue30 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(snapshotMutationPolicy2, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue30);
            }
            final MutableState mutableState35 = (MutableState) rememberedValue30;
            Object rememberedValue31 = startRestartGroup.rememberedValue();
            if (rememberedValue31 == companion4.getEmpty()) {
                rememberedValue31 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, i7, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue31);
            }
            final MutableState mutableState36 = (MutableState) rememberedValue31;
            Boolean valueOf = Boolean.valueOf(z5);
            int i19 = i4 & 14;
            boolean changedInstance7 = (i19 == 4) | startRestartGroup.changedInstance(context3) | startRestartGroup.changedInstance(sharedPreferences) | startRestartGroup.changedInstance(packageManager);
            Object rememberedValue32 = startRestartGroup.rememberedValue();
            if (changedInstance7 || rememberedValue32 == companion4.getEmpty()) {
                w01Var = w01Var2;
                SharedPreferences sharedPreferences6 = sharedPreferences;
                i8 = 6;
                qaVar = new qa(z5, context3, mutableState31, mutableState30, sharedPreferences6, mutableState29, mutableState33, mutableState32, mutableState36, mutableState35, packageManager, mutableState34, null);
                context = context3;
                companion = companion4;
                z4 = z5;
                sharedPreferences2 = sharedPreferences6;
                mutableState6 = mutableState32;
                snackbarHostState2 = snackbarHostState;
                mutableState7 = mutableState33;
                startRestartGroup.updateRememberedValue(qaVar);
            } else {
                z4 = z5;
                w01Var = w01Var2;
                qaVar = rememberedValue32;
                companion = companion4;
                sharedPreferences2 = sharedPreferences;
                mutableState6 = mutableState32;
                snackbarHostState2 = snackbarHostState;
                context = context3;
                mutableState7 = mutableState33;
                i8 = 6;
            }
            EffectsKt.LaunchedEffect(valueOf, (my) qaVar, startRestartGroup, i19);
            boolean changedInstance8 = startRestartGroup.changedInstance(unVar) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(sharedPreferences2);
            Object rememberedValue33 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue33 == companion.getEmpty()) {
                SharedPreferences sharedPreferences7 = sharedPreferences2;
                unVar2 = unVar;
                l8Var = new l8(unVar2, mutableState29, context, sharedPreferences7, mutableState31, mutableState30);
                sharedPreferences3 = sharedPreferences7;
                snapshotStateMap2 = snapshotStateMap5;
                mutableState8 = mutableState31;
                startRestartGroup.updateRememberedValue(l8Var);
            } else {
                SharedPreferences sharedPreferences8 = sharedPreferences2;
                unVar2 = unVar;
                sharedPreferences3 = sharedPreferences8;
                l8Var = rememberedValue33;
                snapshotStateMap2 = snapshotStateMap5;
                mutableState8 = mutableState31;
            }
            ky kyVar10 = (ky) l8Var;
            boolean changedInstance9 = startRestartGroup.changedInstance(unVar2) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(sharedPreferences3) | startRestartGroup.changedInstance(packageManager);
            Object rememberedValue34 = startRestartGroup.rememberedValue();
            if (changedInstance9 || rememberedValue34 == companion.getEmpty()) {
                PackageManager packageManager4 = packageManager;
                rememberedValue34 = new n8(unVar2, context, sharedPreferences3, packageManager4, mutableState34, mutableState36, mutableState35);
                packageManager2 = packageManager4;
                startRestartGroup.updateRememberedValue(rememberedValue34);
            } else {
                packageManager2 = packageManager;
            }
            final ky kyVar11 = (ky) rememberedValue34;
            v1 v1Var = new v1(0);
            boolean changedInstance10 = startRestartGroup.changedInstance(unVar2) | startRestartGroup.changedInstance(context) | startRestartGroup.changed(kyVar9);
            Object rememberedValue35 = startRestartGroup.rememberedValue();
            if (changedInstance10 || rememberedValue35 == companion.getEmpty()) {
                SnapshotStateMap snapshotStateMap6 = snapshotStateMap2;
                un unVar5 = unVar2;
                rememberedValue35 = new y4((Object) mutableState18, (Object) snapshotStateMap6, (Object) unVar5, (Object) context, kyVar9, 2);
                unVar2 = unVar5;
                kyVar2 = kyVar10;
                kyVar3 = kyVar7;
                arrayList2 = arrayList;
                snapshotStateMap3 = snapshotStateMap6;
                kyVar4 = kyVar9;
                startRestartGroup.updateRememberedValue(rememberedValue35);
            } else {
                kyVar2 = kyVar10;
                kyVar3 = kyVar7;
                arrayList2 = arrayList;
                snapshotStateMap3 = snapshotStateMap2;
                kyVar4 = kyVar9;
            }
            final g80 G = d41.G(v1Var, (ky) rememberedValue35, startRestartGroup, 0);
            Boolean bool = (Boolean) mutableState21.getValue();
            bool.getClass();
            boolean changed3 = startRestartGroup.changed(mutableState21) | startRestartGroup.changedInstance(unVar2) | startRestartGroup.changedInstance(context);
            Object rememberedValue36 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue36 == companion.getEmpty()) {
                Context context4 = context;
                un unVar6 = unVar2;
                ra raVar = new ra(mutableState21, unVar6, context4, mutableState23, mutableState22, (hm) null);
                mutableState9 = mutableState21;
                unVar3 = unVar6;
                context2 = context4;
                mutableState10 = mutableState23;
                mutableState11 = mutableState22;
                i9 = 4;
                startRestartGroup.updateRememberedValue(raVar);
                rememberedValue36 = raVar;
            } else {
                mutableState9 = mutableState21;
                mutableState10 = mutableState23;
                mutableState11 = mutableState22;
                context2 = context;
                unVar3 = unVar2;
                i9 = 4;
            }
            EffectsKt.LaunchedEffect(bool, (my) rememberedValue36, startRestartGroup, 0);
            Object rememberedValue37 = startRestartGroup.rememberedValue();
            if (rememberedValue37 == companion.getEmpty()) {
                rememberedValue37 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue37);
            }
            MutableState mutableState37 = (MutableState) rememberedValue37;
            Object rememberedValue38 = startRestartGroup.rememberedValue();
            if (rememberedValue38 == companion.getEmpty()) {
                rememberedValue38 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new xe0("", new e1(5)), snapshotMutationPolicy2, 2, snapshotMutationPolicy2);
                startRestartGroup.updateRememberedValue(rememberedValue38);
            }
            MutableState mutableState38 = (MutableState) rememberedValue38;
            Object[] objArr3 = new Object[0];
            boolean changedInstance11 = startRestartGroup.changedInstance(sharedPreferences3);
            Object rememberedValue39 = startRestartGroup.rememberedValue();
            if (changedInstance11 || rememberedValue39 == companion.getEmpty()) {
                rememberedValue39 = new k8(sharedPreferences3, 1);
                startRestartGroup.updateRememberedValue(rememberedValue39);
            }
            MutableState mutableState39 = (MutableState) RememberSaveableKt.rememberSaveable(objArr3, (iy) rememberedValue39, startRestartGroup, 0);
            Object[] objArr4 = new Object[0];
            Object rememberedValue40 = startRestartGroup.rememberedValue();
            if (rememberedValue40 == companion.getEmpty()) {
                rememberedValue40 = new e1(i8);
                startRestartGroup.updateRememberedValue(rememberedValue40);
            }
            MutableState mutableState40 = (MutableState) RememberSaveableKt.rememberSaveable(objArr4, (iy) rememberedValue40, startRestartGroup, 48);
            boolean changedInstance12 = startRestartGroup.changedInstance(myVar2) | startRestartGroup.changed(mutableState40) | startRestartGroup.changed(mutableState39) | startRestartGroup.changedInstance(sharedPreferences3);
            Object rememberedValue41 = startRestartGroup.rememberedValue();
            if (changedInstance12 || rememberedValue41 == companion.getEmpty()) {
                SharedPreferences sharedPreferences9 = sharedPreferences3;
                my myVar5 = myVar2;
                a3 a3Var = new a3(myVar5, sharedPreferences9, mutableState40, mutableState39, (hm) null);
                myVar4 = myVar5;
                sharedPreferences4 = sharedPreferences9;
                mutableState12 = mutableState40;
                mutableState13 = mutableState39;
                startRestartGroup.updateRememberedValue(a3Var);
                rememberedValue41 = a3Var;
            } else {
                sharedPreferences4 = sharedPreferences3;
                mutableState13 = mutableState39;
                myVar4 = myVar2;
                mutableState12 = mutableState40;
            }
            EffectsKt.LaunchedEffect(w01Var, (my) rememberedValue41, startRestartGroup, i8);
            if (((Boolean) mutableState37.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(-1345006120);
                Object rememberedValue42 = startRestartGroup.rememberedValue();
                if (rememberedValue42 == companion.getEmpty()) {
                    rememberedValue42 = new j3(mutableState37, i9);
                    startRestartGroup.updateRememberedValue(rememberedValue42);
                }
                int i20 = 1;
                mutableState15 = mutableState38;
                mutableState14 = mutableState37;
                snackbarHostState3 = snackbarHostState2;
                kyVar5 = kyVar;
                i10 = -1371879710;
                activity3 = activity2;
                AndroidAlertDialog_androidKt.m1600AlertDialogOix01E0((iy) rememberedValue42, ComposableLambdaKt.rememberComposableLambda(423953005, true, new r4(i20, mutableState38, mutableState37), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(787419503, true, new r5(mutableState37, i20), startRestartGroup, 54), null, null, ComposableLambdaKt.rememberComposableLambda(1332619250, true, new r5(mutableState38, 2), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, startRestartGroup, 1772598, 0, 16276);
                composer3 = startRestartGroup;
            } else {
                mutableState14 = mutableState37;
                mutableState15 = mutableState38;
                i10 = -1371879710;
                activity3 = activity2;
                snackbarHostState3 = snackbarHostState2;
                kyVar5 = kyVar;
                startRestartGroup.startReplaceGroup(-1371879710);
                composer3 = startRestartGroup;
            }
            composer3.endReplaceGroup();
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composer3.startReplaceGroup(-1343019330);
                Object rememberedValue43 = composer3.rememberedValue();
                if (rememberedValue43 == companion.getEmpty()) {
                    mutableState16 = mutableState2;
                    rememberedValue43 = new j3(mutableState16, 2);
                    composer3.updateRememberedValue(rememberedValue43);
                } else {
                    mutableState16 = mutableState2;
                }
                kyVar6 = kyVar5;
                l((iy) rememberedValue43, kyVar6, composer3, 6);
            } else {
                mutableState16 = mutableState2;
                kyVar6 = kyVar5;
                composer3.startReplaceGroup(i10);
            }
            composer3.endReplaceGroup();
            int i21 = 0;
            final MutableState mutableState41 = mutableState16;
            final ky kyVar12 = kyVar6;
            final boolean z6 = z4;
            final my myVar6 = myVar4;
            final MutableState mutableState42 = mutableState;
            final un unVar7 = unVar3;
            final Context context5 = context2;
            final ky kyVar13 = kyVar3;
            final ky kyVar14 = kyVar2;
            final MutableState mutableState43 = mutableState11;
            final MutableState mutableState44 = mutableState10;
            final SharedPreferences sharedPreferences10 = sharedPreferences4;
            final MutableState mutableState45 = mutableState13;
            final MutableState mutableState46 = mutableState12;
            final MutableState mutableState47 = mutableState15;
            final MutableState mutableState48 = mutableState14;
            ScaffoldKt.m2300ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(95766300, true, new g8(activity3, i21), composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-996868902, true, new h8(snackbarHostState3, i21), composer3, 54), null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(780915185, true, new ny() { // from class: i8
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v20, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v9 */
                @Override // defpackage.ny
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    ?? D;
                    SharedPreferences sharedPreferences11;
                    List list3;
                    PagerState pagerState;
                    Object obj7;
                    PaddingValues paddingValues = (PaddingValues) obj4;
                    Composer composer4 = (Composer) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    paddingValues.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= composer4.changed(paddingValues) ? 4 : 2;
                    }
                    int i22 = 1;
                    if (composer4.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        int i23 = -1;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(780915185, intValue, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous> (AppsActivity.kt:680)");
                        }
                        List E3 = y80.E("Launch", "Install", "Uninstall", "Magisk Repo", "Vector Repo");
                        final boolean z7 = z6;
                        if (z7) {
                            D = new ArrayList(zi.a0(E3, 10));
                            int i24 = 0;
                            for (Object obj8 : E3) {
                                int i25 = i24 + 1;
                                if (i24 < 0) {
                                    y80.V();
                                    throw null;
                                }
                                D.add(new xe0(Integer.valueOf(i24), (String) obj8));
                                i24 = i25;
                            }
                        } else {
                            D = y80.D(new xe0(0, "Launch"));
                        }
                        List list4 = D;
                        SharedPreferences sharedPreferences12 = sharedPreferences10;
                        int i26 = sharedPreferences12.getInt("last_app_tab", 0);
                        Iterator it2 = list4.iterator();
                        int i27 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (((Number) ((xe0) it2.next()).d).intValue() == i26) {
                                i23 = i27;
                                break;
                            }
                            i27++;
                        }
                        int i28 = i23 >= 0 ? i23 : 0;
                        boolean changedInstance13 = composer4.changedInstance(list4);
                        Object rememberedValue44 = composer4.rememberedValue();
                        if (changedInstance13 || rememberedValue44 == Composer.Companion.getEmpty()) {
                            rememberedValue44 = new o8(list4, 0);
                            composer4.updateRememberedValue(rememberedValue44);
                        }
                        PagerState rememberPagerState = PagerStateKt.rememberPagerState(i28, 0.0f, (iy) rememberedValue44, composer4, 0, 2);
                        Integer valueOf2 = Integer.valueOf(rememberPagerState.getCurrentPage());
                        boolean changedInstance14 = composer4.changedInstance(sharedPreferences12) | composer4.changedInstance(list4) | composer4.changed(rememberPagerState);
                        Object rememberedValue45 = composer4.rememberedValue();
                        if (changedInstance14 || rememberedValue45 == Composer.Companion.getEmpty()) {
                            sharedPreferences11 = sharedPreferences12;
                            rememberedValue45 = new u9(sharedPreferences11, list4, rememberPagerState, null, 0);
                            list3 = list4;
                            pagerState = rememberPagerState;
                            obj7 = null;
                            composer4.updateRememberedValue(rememberedValue45);
                        } else {
                            pagerState = rememberPagerState;
                            list3 = list4;
                            sharedPreferences11 = sharedPreferences12;
                            obj7 = null;
                        }
                        EffectsKt.LaunchedEffect(valueOf2, (my) rememberedValue45, composer4, 0);
                        Modifier.Companion companion5 = Modifier.Companion;
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.padding(companion5, paddingValues), 0.0f, 1, obj7);
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer4, 0);
                        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, fillMaxSize$default);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.Companion;
                        iy constructor = companion6.getConstructor();
                        if (composer4.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer m3878constructorimpl = Updater.m3878constructorimpl(composer4);
                        uo.h(companion6, m3878constructorimpl, columnMeasurePolicy, m3878constructorimpl, currentCompositionLocalMap);
                        Updater.m3886setimpl(m3878constructorimpl, materializeModifier, k4.c(companion6, m3878constructorimpl, Integer.valueOf(hashCode), m3878constructorimpl));
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int currentPage = pagerState.getCurrentPage();
                        final un unVar8 = unVar7;
                        PagerState pagerState2 = pagerState;
                        final List list5 = list3;
                        TabRowKt.m2511PrimaryTabRowpAZo6Ak(currentPage, null, 0L, 0L, null, null, ComposableLambdaKt.rememberComposableLambda(-2120865123, true, new m6(list3, pagerState, unVar8, i22), composer4, 54), composer4, 1572864, 62);
                        Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, obj7), 1.0f, false, 2, null);
                        final MutableState mutableState49 = mutableState46;
                        final MutableState mutableState50 = mutableState45;
                        final my myVar7 = myVar6;
                        final ky kyVar15 = kyVar13;
                        final Context context6 = context5;
                        final MutableState mutableState51 = mutableState42;
                        final ky kyVar16 = kyVar12;
                        final ArrayList arrayList3 = arrayList2;
                        final PackageManager packageManager5 = packageManager2;
                        final g80 g80Var = G;
                        final ky kyVar17 = kyVar4;
                        final MutableState mutableState52 = mutableState9;
                        final ky kyVar18 = kyVar14;
                        final ky kyVar19 = kyVar11;
                        final MutableState mutableState53 = mutableState47;
                        final MutableState mutableState54 = mutableState48;
                        final MutableState mutableState55 = mutableState41;
                        final MutableState mutableState56 = mutableState4;
                        final MutableState mutableState57 = mutableState25;
                        final MutableState mutableState58 = mutableState5;
                        final SnapshotStateMap snapshotStateMap7 = snapshotStateMap3;
                        final MutableState mutableState59 = mutableState18;
                        final MutableState mutableState60 = mutableState44;
                        final MutableState mutableState61 = mutableState43;
                        final MutableState mutableState62 = mutableState7;
                        final MutableState mutableState63 = mutableState6;
                        final MutableState mutableState64 = mutableState29;
                        final MutableState mutableState65 = mutableState8;
                        final MutableState mutableState66 = mutableState30;
                        final MutableState mutableState67 = mutableState36;
                        final MutableState mutableState68 = mutableState35;
                        final MutableState mutableState69 = mutableState34;
                        final SharedPreferences sharedPreferences13 = sharedPreferences11;
                        PagerKt.m1002HorizontalPager8jOkeI(pagerState2, weight$default, null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1991686696, true, new oy() { // from class: p8
                            @Override // defpackage.oy
                            public final Object invoke(Object obj9, Object obj10, Object obj11, Object obj12) {
                                int intValue2 = ((Integer) obj10).intValue();
                                Composer composer5 = (Composer) obj11;
                                int intValue3 = ((Integer) obj12).intValue();
                                ((PagerScope) obj9).getClass();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1991686696, intValue3, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:723)");
                                }
                                final int intValue4 = ((Number) ((xe0) list5.get(intValue2)).d).intValue();
                                Modifier m764paddingVpY3zN4$default = PaddingKt.m764paddingVpY3zN4$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m7611constructorimpl(12.0f), 0.0f, 2, null);
                                PaddingValues m757PaddingValuesYgX7TsA$default = PaddingKt.m757PaddingValuesYgX7TsA$default(0.0f, Dp.m7611constructorimpl(16.0f), 1, null);
                                Arrangement.HorizontalOrVertical m647spacedBy0680j_4 = Arrangement.INSTANCE.m647spacedBy0680j_4(Dp.m7611constructorimpl(8.0f));
                                boolean changed4 = composer5.changed(intValue4);
                                final boolean z8 = z7;
                                boolean changed5 = changed4 | composer5.changed(z8);
                                final MutableState mutableState70 = mutableState49;
                                boolean changed6 = changed5 | composer5.changed(mutableState70);
                                final MutableState mutableState71 = mutableState50;
                                boolean changed7 = changed6 | composer5.changed(mutableState71);
                                final un unVar9 = unVar8;
                                boolean changedInstance15 = changed7 | composer5.changedInstance(unVar9);
                                final my myVar8 = myVar7;
                                boolean changedInstance16 = changedInstance15 | composer5.changedInstance(myVar8);
                                final SharedPreferences sharedPreferences14 = sharedPreferences13;
                                boolean changedInstance17 = changedInstance16 | composer5.changedInstance(sharedPreferences14);
                                final ky kyVar20 = kyVar15;
                                boolean changed8 = changedInstance17 | composer5.changed(kyVar20);
                                final Context context7 = context6;
                                boolean changedInstance18 = changed8 | composer5.changedInstance(context7);
                                final MutableState mutableState72 = mutableState51;
                                boolean changed9 = changedInstance18 | composer5.changed(mutableState72);
                                final ky kyVar21 = kyVar16;
                                boolean changed10 = changed9 | composer5.changed(kyVar21);
                                final ArrayList arrayList4 = arrayList3;
                                boolean changedInstance19 = changed10 | composer5.changedInstance(arrayList4);
                                final PackageManager packageManager6 = packageManager5;
                                boolean changedInstance20 = changedInstance19 | composer5.changedInstance(packageManager6);
                                final g80 g80Var2 = g80Var;
                                boolean changedInstance21 = changedInstance20 | composer5.changedInstance(g80Var2);
                                final ky kyVar22 = kyVar17;
                                boolean changed11 = changedInstance21 | composer5.changed(kyVar22);
                                final MutableState mutableState73 = mutableState52;
                                boolean changed12 = changed11 | composer5.changed(mutableState73);
                                final ky kyVar23 = kyVar18;
                                boolean changed13 = changed12 | composer5.changed(kyVar23);
                                final ky kyVar24 = kyVar19;
                                boolean changed14 = changed13 | composer5.changed(kyVar24);
                                Object rememberedValue46 = composer5.rememberedValue();
                                if (changed14 || rememberedValue46 == Composer.Companion.getEmpty()) {
                                    final MutableState mutableState74 = mutableState53;
                                    final MutableState mutableState75 = mutableState54;
                                    final MutableState mutableState76 = mutableState55;
                                    final MutableState mutableState77 = mutableState56;
                                    final MutableState mutableState78 = mutableState57;
                                    final MutableState mutableState79 = mutableState58;
                                    final SnapshotStateMap snapshotStateMap8 = snapshotStateMap7;
                                    final MutableState mutableState80 = mutableState59;
                                    final MutableState mutableState81 = mutableState60;
                                    final MutableState mutableState82 = mutableState61;
                                    final MutableState mutableState83 = mutableState62;
                                    final MutableState mutableState84 = mutableState63;
                                    final MutableState mutableState85 = mutableState64;
                                    final MutableState mutableState86 = mutableState65;
                                    final MutableState mutableState87 = mutableState66;
                                    final MutableState mutableState88 = mutableState67;
                                    final MutableState mutableState89 = mutableState68;
                                    final MutableState mutableState90 = mutableState69;
                                    ky kyVar25 = new ky() { // from class: u8
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // defpackage.ky
                                        public final Object invoke(Object obj13) {
                                            Context context8;
                                            LazyListScope lazyListScope = (LazyListScope) obj13;
                                            lazyListScope.getClass();
                                            int i29 = 0;
                                            int i30 = intValue4;
                                            final un unVar10 = unVar9;
                                            final SharedPreferences sharedPreferences15 = sharedPreferences14;
                                            final ky kyVar26 = kyVar20;
                                            Context context9 = context7;
                                            final int i31 = 1;
                                            if (i30 != 0) {
                                                PackageManager packageManager7 = packageManager6;
                                                if (i30 == 1) {
                                                    MutableState mutableState91 = mutableState77;
                                                    MutableState mutableState92 = mutableState78;
                                                    MutableState mutableState93 = mutableState79;
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1444020514, true, new d9(unVar10, context9, mutableState91, mutableState92, mutableState93, 0)), 3, null);
                                                    if (((Boolean) mutableState91.getValue()).booleanValue() && ((List) mutableState93.getValue()).isEmpty()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, wk.j, 3, null);
                                                    }
                                                    String str6 = (String) mutableState92.getValue();
                                                    if (str6 != null) {
                                                        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-877448770, true, new q2(str6, i31)), 3, null);
                                                    }
                                                    ArrayList arrayList5 = arrayList4;
                                                    lazyListScope.items(arrayList5.size(), null, new ab(arrayList5, 0), ComposableLambdaKt.composableLambdaInstance(802480018, true, new bb(arrayList5, snapshotStateMap8, unVar10, packageManager7, context9, g80Var2, kyVar22, mutableState80)));
                                                } else if (i30 == 2) {
                                                    MutableState mutableState94 = mutableState73;
                                                    MutableState mutableState95 = mutableState81;
                                                    MutableState mutableState96 = mutableState82;
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1864139459, true, new w8(mutableState94, sharedPreferences15, unVar10, context9, mutableState95, mutableState96)), 3, null);
                                                    if (((Boolean) mutableState94.getValue()).booleanValue()) {
                                                        if (!((List) mutableState96.getValue()).isEmpty() || ((Boolean) mutableState95.getValue()).booleanValue()) {
                                                            List list6 = (List) mutableState96.getValue();
                                                            lazyListScope.items(list6.size(), null, new xa(list6, 2), ComposableLambdaKt.composableLambdaInstance(802480018, true, new za(list6, unVar10, context9, mutableState95, mutableState96, 1)));
                                                        } else {
                                                            LazyListScope.item$default(lazyListScope, null, null, wk.k, 3, null);
                                                        }
                                                    }
                                                } else if (i30 == 3) {
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(2010708892, true, new e9(unVar10, mutableState83, mutableState84, i29)), 3, null);
                                                    MutableState mutableState97 = mutableState85;
                                                    List list7 = (List) mutableState97.getValue();
                                                    if (list7 == null || !list7.isEmpty()) {
                                                        Iterator it3 = list7.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            if (((sa) it3.next()).i) {
                                                                LazyListScope.item$default(lazyListScope, null, null, wk.p, 3, null);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    MutableState mutableState98 = mutableState86;
                                                    MutableState mutableState99 = mutableState87;
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(2080839251, true, new w8(unVar10, context9, sharedPreferences15, mutableState98, mutableState99, mutableState97)), 3, null);
                                                    LazyListScope.item$default(lazyListScope, null, null, wk.r, 3, null);
                                                    if (((Boolean) mutableState98.getValue()).booleanValue()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, wk.s, 3, null);
                                                    } else if (((String) mutableState99.getValue()) != null) {
                                                        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(163942999, true, new w8(mutableState99, unVar10, context9, sharedPreferences15, mutableState98, mutableState97)), 3, null);
                                                    } else if (((List) mutableState97.getValue()).isEmpty()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, wk.u, 3, null);
                                                    } else {
                                                        List list8 = (List) mutableState97.getValue();
                                                        lazyListScope.items(list8.size(), new a4(2, new d1(24), list8), new xa(list8, 0), ComposableLambdaKt.composableLambdaInstance(802480018, true, new ya(0, kyVar23, list8)));
                                                    }
                                                } else if (i30 == 4) {
                                                    MutableState mutableState100 = mutableState88;
                                                    MutableState mutableState101 = mutableState89;
                                                    MutableState mutableState102 = mutableState90;
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1590589947, true, new y8(unVar10, context9, sharedPreferences15, packageManager7, mutableState100, mutableState101, mutableState102)), 3, null);
                                                    LazyListScope.item$default(lazyListScope, null, null, wk.w, 3, null);
                                                    if (((Boolean) mutableState100.getValue()).booleanValue()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, wk.x, 3, null);
                                                    } else if (((String) mutableState101.getValue()) != null) {
                                                        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(860104447, true, new y8(mutableState101, unVar10, context9, sharedPreferences15, packageManager7, mutableState100, mutableState102)), 3, null);
                                                    } else if (((List) mutableState102.getValue()).isEmpty()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, wk.z, 3, null);
                                                    } else {
                                                        List list9 = (List) mutableState102.getValue();
                                                        lazyListScope.items(list9.size(), new a4(3, new d1(25), list9), new xa(list9, 1), ComposableLambdaKt.composableLambdaInstance(802480018, true, new za(list9, sharedPreferences15, context9, kyVar26, kyVar24, 0)));
                                                    }
                                                }
                                            } else {
                                                final int i32 = 0;
                                                final boolean z9 = z8;
                                                if (z9) {
                                                    final MutableState mutableState103 = mutableState70;
                                                    final my myVar9 = myVar8;
                                                    final MutableState mutableState104 = mutableState71;
                                                    final MutableState mutableState105 = mutableState74;
                                                    final MutableState mutableState106 = mutableState75;
                                                    context8 = context9;
                                                    i32 = 0;
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1024632016, true, new ny() { // from class: v8
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.ny
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            Composer composer6 = (Composer) obj15;
                                                            int intValue5 = ((Integer) obj16).intValue();
                                                            ((LazyItemScope) obj14).getClass();
                                                            if (composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1024632016, intValue5, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:735)");
                                                                }
                                                                MutableState mutableState107 = MutableState.this;
                                                                o01.a("Enable Dogfood Hub/Shell Debug", ((String) mutableState107.getValue()) != null ? uo.d("Enables the ", (String) mutableState107.getValue(), " preference and restarts the VR shell to unlock the panels below") : "Spoofs a userdebug build type (requires a full interface restart) to unlock the panels below", null, ComposableLambdaKt.rememberComposableLambda(-1691556002, true, new k9(mutableState107, unVar10, myVar9, mutableState104, sharedPreferences15, kyVar26, z9, mutableState105, mutableState106), composer6, 54), composer6, 3078, 4);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            } else {
                                                                composer6.skipToGroupEnd();
                                                            }
                                                            return w01.a;
                                                        }
                                                    }), 3, null);
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(594679943, true, new ny() { // from class: z8
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.ny
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            int i33 = i32;
                                                            w01 w01Var3 = w01.a;
                                                            final MutableState mutableState107 = mutableState104;
                                                            final un unVar11 = unVar10;
                                                            Object[] objArr5 = 0;
                                                            final int i34 = 1;
                                                            LazyItemScope lazyItemScope = (LazyItemScope) obj14;
                                                            Composer composer6 = (Composer) obj15;
                                                            int intValue5 = ((Integer) obj16).intValue();
                                                            switch (i33) {
                                                                case 0:
                                                                    lazyItemScope.getClass();
                                                                    if (!composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        break;
                                                                    } else {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(594679943, intValue5, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:786)");
                                                                        }
                                                                        kb.a("Dogfood Hub", "Enables the hidden Dogfood Hub for experimental features", ComposableLambdaKt.rememberComposableLambda(-406281109, true, new my() { // from class: h9
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            @Override // defpackage.my
                                                                            public final Object invoke(Object obj17, Object obj18) {
                                                                                int i35 = i34;
                                                                                w01 w01Var4 = w01.a;
                                                                                MutableState mutableState108 = mutableState107;
                                                                                un unVar12 = unVar11;
                                                                                int i36 = 1;
                                                                                switch (i35) {
                                                                                    case 0:
                                                                                        Composer composer7 = (Composer) obj17;
                                                                                        int intValue6 = ((Integer) obj18).intValue();
                                                                                        if (!composer7.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                                                                                            composer7.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-387854356, intValue6, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:796)");
                                                                                            }
                                                                                            boolean changedInstance22 = composer7.changedInstance(unVar12);
                                                                                            Object rememberedValue47 = composer7.rememberedValue();
                                                                                            if (changedInstance22 || rememberedValue47 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue47 = new x8(unVar12, i36);
                                                                                                composer7.updateRememberedValue(rememberedValue47);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue47, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.f, composer7, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        Composer composer8 = (Composer) obj17;
                                                                                        int intValue7 = ((Integer) obj18).intValue();
                                                                                        if (!composer8.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                                                                                            composer8.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-406281109, intValue7, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:787)");
                                                                                            }
                                                                                            boolean changedInstance23 = composer8.changedInstance(unVar12);
                                                                                            Object rememberedValue48 = composer8.rememberedValue();
                                                                                            if (changedInstance23 || rememberedValue48 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue48 = new x8(unVar12, 3);
                                                                                                composer8.updateRememberedValue(rememberedValue48);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue48, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.e, composer8, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return w01Var4;
                                                                            }
                                                                        }, composer6, 54), composer6, 438);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    lazyItemScope.getClass();
                                                                    if (!composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        break;
                                                                    } else {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(613106696, intValue5, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:795)");
                                                                        }
                                                                        final Object[] objArr6 = objArr5 == true ? 1 : 0;
                                                                        kb.a("Shell Debug", "Launches employee only debug configuration", ComposableLambdaKt.rememberComposableLambda(-387854356, true, new my() { // from class: h9
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            @Override // defpackage.my
                                                                            public final Object invoke(Object obj17, Object obj18) {
                                                                                int i35 = objArr6;
                                                                                w01 w01Var4 = w01.a;
                                                                                MutableState mutableState108 = mutableState107;
                                                                                un unVar12 = unVar11;
                                                                                int i36 = 1;
                                                                                switch (i35) {
                                                                                    case 0:
                                                                                        Composer composer7 = (Composer) obj17;
                                                                                        int intValue6 = ((Integer) obj18).intValue();
                                                                                        if (!composer7.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                                                                                            composer7.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-387854356, intValue6, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:796)");
                                                                                            }
                                                                                            boolean changedInstance22 = composer7.changedInstance(unVar12);
                                                                                            Object rememberedValue47 = composer7.rememberedValue();
                                                                                            if (changedInstance22 || rememberedValue47 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue47 = new x8(unVar12, i36);
                                                                                                composer7.updateRememberedValue(rememberedValue47);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue47, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.f, composer7, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        Composer composer8 = (Composer) obj17;
                                                                                        int intValue7 = ((Integer) obj18).intValue();
                                                                                        if (!composer8.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                                                                                            composer8.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-406281109, intValue7, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:787)");
                                                                                            }
                                                                                            boolean changedInstance23 = composer8.changedInstance(unVar12);
                                                                                            Object rememberedValue48 = composer8.rememberedValue();
                                                                                            if (changedInstance23 || rememberedValue48 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue48 = new x8(unVar12, 3);
                                                                                                composer8.updateRememberedValue(rememberedValue48);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue48, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.e, composer8, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return w01Var4;
                                                                            }
                                                                        }, composer6, 54), composer6, 438);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            return w01Var3;
                                                        }
                                                    }), 3, null);
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(613106696, true, new ny() { // from class: z8
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.ny
                                                        public final Object invoke(Object obj14, Object obj15, Object obj16) {
                                                            int i33 = i31;
                                                            w01 w01Var3 = w01.a;
                                                            final MutableState mutableState107 = mutableState104;
                                                            final un unVar11 = unVar10;
                                                            Object[] objArr5 = 0;
                                                            final int i34 = 1;
                                                            LazyItemScope lazyItemScope = (LazyItemScope) obj14;
                                                            Composer composer6 = (Composer) obj15;
                                                            int intValue5 = ((Integer) obj16).intValue();
                                                            switch (i33) {
                                                                case 0:
                                                                    lazyItemScope.getClass();
                                                                    if (!composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        break;
                                                                    } else {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(594679943, intValue5, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:786)");
                                                                        }
                                                                        kb.a("Dogfood Hub", "Enables the hidden Dogfood Hub for experimental features", ComposableLambdaKt.rememberComposableLambda(-406281109, true, new my() { // from class: h9
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            @Override // defpackage.my
                                                                            public final Object invoke(Object obj17, Object obj18) {
                                                                                int i35 = i34;
                                                                                w01 w01Var4 = w01.a;
                                                                                MutableState mutableState108 = mutableState107;
                                                                                un unVar12 = unVar11;
                                                                                int i36 = 1;
                                                                                switch (i35) {
                                                                                    case 0:
                                                                                        Composer composer7 = (Composer) obj17;
                                                                                        int intValue6 = ((Integer) obj18).intValue();
                                                                                        if (!composer7.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                                                                                            composer7.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-387854356, intValue6, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:796)");
                                                                                            }
                                                                                            boolean changedInstance22 = composer7.changedInstance(unVar12);
                                                                                            Object rememberedValue47 = composer7.rememberedValue();
                                                                                            if (changedInstance22 || rememberedValue47 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue47 = new x8(unVar12, i36);
                                                                                                composer7.updateRememberedValue(rememberedValue47);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue47, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.f, composer7, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        Composer composer8 = (Composer) obj17;
                                                                                        int intValue7 = ((Integer) obj18).intValue();
                                                                                        if (!composer8.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                                                                                            composer8.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-406281109, intValue7, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:787)");
                                                                                            }
                                                                                            boolean changedInstance23 = composer8.changedInstance(unVar12);
                                                                                            Object rememberedValue48 = composer8.rememberedValue();
                                                                                            if (changedInstance23 || rememberedValue48 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue48 = new x8(unVar12, 3);
                                                                                                composer8.updateRememberedValue(rememberedValue48);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue48, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.e, composer8, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return w01Var4;
                                                                            }
                                                                        }, composer6, 54), composer6, 438);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    lazyItemScope.getClass();
                                                                    if (!composer6.shouldExecute((intValue5 & 17) != 16, intValue5 & 1)) {
                                                                        composer6.skipToGroupEnd();
                                                                        break;
                                                                    } else {
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(613106696, intValue5, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:795)");
                                                                        }
                                                                        final int objArr6 = objArr5 == true ? 1 : 0;
                                                                        kb.a("Shell Debug", "Launches employee only debug configuration", ComposableLambdaKt.rememberComposableLambda(-387854356, true, new my() { // from class: h9
                                                                            /* JADX WARN: Multi-variable type inference failed */
                                                                            @Override // defpackage.my
                                                                            public final Object invoke(Object obj17, Object obj18) {
                                                                                int i35 = objArr6;
                                                                                w01 w01Var4 = w01.a;
                                                                                MutableState mutableState108 = mutableState107;
                                                                                un unVar12 = unVar11;
                                                                                int i36 = 1;
                                                                                switch (i35) {
                                                                                    case 0:
                                                                                        Composer composer7 = (Composer) obj17;
                                                                                        int intValue6 = ((Integer) obj18).intValue();
                                                                                        if (!composer7.shouldExecute((intValue6 & 3) != 2, intValue6 & 1)) {
                                                                                            composer7.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-387854356, intValue6, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:796)");
                                                                                            }
                                                                                            boolean changedInstance22 = composer7.changedInstance(unVar12);
                                                                                            Object rememberedValue47 = composer7.rememberedValue();
                                                                                            if (changedInstance22 || rememberedValue47 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue47 = new x8(unVar12, i36);
                                                                                                composer7.updateRememberedValue(rememberedValue47);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue47, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.f, composer7, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        Composer composer8 = (Composer) obj17;
                                                                                        int intValue7 = ((Integer) obj18).intValue();
                                                                                        if (!composer8.shouldExecute((intValue7 & 3) != 2, intValue7 & 1)) {
                                                                                            composer8.skipToGroupEnd();
                                                                                            break;
                                                                                        } else {
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventStart(-406281109, intValue7, -1, "com.lumi.singularity.ui.activities.AppsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppsActivity.kt:787)");
                                                                                            }
                                                                                            boolean changedInstance23 = composer8.changedInstance(unVar12);
                                                                                            Object rememberedValue48 = composer8.rememberedValue();
                                                                                            if (changedInstance23 || rememberedValue48 == Composer.Companion.getEmpty()) {
                                                                                                rememberedValue48 = new x8(unVar12, 3);
                                                                                                composer8.updateRememberedValue(rememberedValue48);
                                                                                            }
                                                                                            ButtonKt.Button((iy) rememberedValue48, null, ((Boolean) mutableState108.getValue()).booleanValue(), RoundedCornerShapeKt.m1056RoundedCornerShape0680j_4(Dp.m7611constructorimpl(12.0f)), null, null, null, null, null, wk.e, composer8, 805306368, 498);
                                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                                ComposerKt.traceEventEnd();
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                }
                                                                                return w01Var4;
                                                                            }
                                                                        }, composer6, 54), composer6, 438);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            return w01Var3;
                                                        }
                                                    }), 3, null);
                                                } else {
                                                    context8 = context9;
                                                }
                                                LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(1275585333, true, new a9(i32, unVar10, z9, context8)), 3, null);
                                                if (z9) {
                                                    LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1057225081, true, new x6(unVar10, i31)), 3, null);
                                                    if (!hr.c()) {
                                                        LazyListScope.item$default(lazyListScope, null, null, ComposableLambdaKt.composableLambdaInstance(-1539164254, true, new b9(kyVar21, mutableState72, mutableState76)), 3, null);
                                                    }
                                                }
                                            }
                                            return w01.a;
                                        }
                                    };
                                    composer5.updateRememberedValue(kyVar25);
                                    rememberedValue46 = kyVar25;
                                }
                                LazyDslKt.LazyColumn(m764paddingVpY3zN4$default, null, m757PaddingValuesYgX7TsA$default, false, m647spacedBy0680j_4, null, null, false, null, (ky) rememberedValue46, composer5, 24966, 490);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                return w01.a;
                            }
                        }, composer4, 54), composer4, 0, 24576, 16380);
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return w01.a;
                }
            }, composer3, 54), composer3, 805309488, 501);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = z6;
            myVar3 = myVar6;
            composer2 = composer3;
        } else {
            startRestartGroup.skipToGroupEnd();
            z3 = z2;
            myVar3 = myVar2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new j8(z3, myVar3, i, i2, 0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x01e9, code lost:
    
        r17 = r4;
        r4 = r0;
        r0 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0171 -> B:11:0x0172). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(MutableState mutableState, SharedPreferences sharedPreferences, Context context, boolean z, im imVar) {
        ua uaVar;
        int i;
        Context context2;
        boolean z2;
        Iterator it;
        ua uaVar2;
        int i2;
        MutableState mutableState2;
        SharedPreferences sharedPreferences2;
        String str;
        Context context3;
        Iterator it2;
        q90 q90Var;
        String str2;
        fi0 fi0Var;
        ji0 ji0Var;
        boolean z3;
        SharedPreferences sharedPreferences3;
        MutableState mutableState3;
        int i3;
        int i4;
        String str3;
        String str4;
        int i5;
        Object H;
        String p;
        if (imVar instanceof ua) {
            uaVar = (ua) imVar;
            int i6 = uaVar.q;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                uaVar.q = i6 - Integer.MIN_VALUE;
                Object obj = uaVar.p;
                i = uaVar.q;
                String str5 = null;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    List list = (List) mutableState.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((sa) obj2).d) {
                            arrayList.add(obj2);
                        }
                    }
                    context2 = context;
                    z2 = z;
                    it = arrayList.iterator();
                    uaVar2 = uaVar;
                    i2 = 0;
                    mutableState2 = mutableState;
                    sharedPreferences2 = sharedPreferences;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        int i7 = uaVar.o;
                        int i8 = uaVar.n;
                        z3 = uaVar.m;
                        ji0Var = uaVar.l;
                        String str6 = uaVar.k;
                        fi0 fi0Var2 = uaVar.j;
                        String str7 = uaVar.i;
                        q90 q90Var2 = uaVar.h;
                        Iterator it3 = uaVar.g;
                        Context context4 = uaVar.f;
                        sharedPreferences3 = uaVar.e;
                        MutableState mutableState4 = uaVar.d;
                        p10.Q(obj);
                        i3 = i7;
                        i4 = i8;
                        mutableState3 = mutableState4;
                        str = str6;
                        fi0Var = fi0Var2;
                        str2 = str7;
                        q90Var = q90Var2;
                        it2 = it3;
                        context3 = context4;
                        str3 = (String) obj;
                        if (str3 == null) {
                        }
                        uaVar.d = mutableState3;
                        uaVar.e = sharedPreferences3;
                        uaVar.f = context3;
                        uaVar.g = it2;
                        uaVar.h = q90Var;
                        uaVar.i = str2;
                        uaVar.j = fi0Var;
                        str4 = null;
                        uaVar.k = null;
                        uaVar.l = ji0Var;
                        uaVar.m = z3;
                        uaVar.n = i4;
                        uaVar.o = i3;
                        uaVar.q = 2;
                        nq nqVar = nr.a;
                        i5 = i4;
                        H = p01.H(hq.d, new qe(str, (hm) (0 == true ? 1 : 0), 8), uaVar);
                        if (H != vnVar) {
                        }
                        return vnVar;
                    }
                    if (i != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i9 = uaVar.n;
                    z3 = uaVar.m;
                    ji0Var = uaVar.l;
                    fi0Var = uaVar.j;
                    str2 = uaVar.i;
                    q90Var = uaVar.h;
                    it2 = uaVar.g;
                    context3 = uaVar.f;
                    SharedPreferences sharedPreferences4 = uaVar.e;
                    mutableState3 = uaVar.d;
                    p10.Q(obj);
                    i5 = i9;
                    H = obj;
                    str4 = null;
                    boolean booleanValue = ((Boolean) H).booleanValue();
                    String d = fi0Var.d ? uo.d("Installed (v", str2, ")") : "Update Available (" + ji0Var.d + ")";
                    List<sa> list2 = (List) mutableState3.getValue();
                    ArrayList arrayList2 = new ArrayList(zi.a0(list2, 10));
                    for (sa saVar : list2) {
                        if (saVar.a.a.equals(q90Var.a)) {
                            saVar = sa.a(saVar, d, booleanValue, fi0Var.d, (String) ji0Var.d, 301);
                        }
                        arrayList2.add(saVar);
                    }
                    mutableState3.setValue(arrayList2);
                    uaVar2 = uaVar;
                    z2 = z3;
                    it = it2;
                    context2 = context3;
                    sharedPreferences2 = sharedPreferences4;
                    str5 = str4;
                    mutableState2 = mutableState3;
                    i2 = i5;
                    if (!it.hasNext()) {
                        sa saVar2 = (sa) it.next();
                        q90 q90Var3 = saVar2.a;
                        String string = sharedPreferences2.getString("vector_pkg_".concat(q90Var3.a), str5);
                        if (string != null || (string = q90Var3.i) != null) {
                            str = string;
                            String str8 = saVar2.f;
                            if (str8 != null) {
                                fi0 fi0Var3 = new fi0();
                                ji0 ji0Var2 = new ji0();
                                String str9 = q90Var3.e;
                                String str10 = q90Var3.f;
                                uaVar2.d = mutableState2;
                                uaVar2.e = sharedPreferences2;
                                uaVar2.f = context2;
                                uaVar2.g = it;
                                uaVar2.h = q90Var3;
                                uaVar2.i = str8;
                                uaVar2.j = fi0Var3;
                                uaVar2.k = str;
                                uaVar2.l = ji0Var2;
                                uaVar2.m = z2;
                                uaVar2.n = i2;
                                uaVar2.o = 0;
                                uaVar2.q = 1;
                                nq nqVar2 = nr.a;
                                Object H2 = p01.H(hq.d, new t90(str9, str10, context2, z2, (hm) null), uaVar2);
                                if (H2 != vnVar) {
                                    it2 = it;
                                    i4 = i2;
                                    z3 = z2;
                                    q90Var = q90Var3;
                                    fi0Var = fi0Var3;
                                    ji0Var = ji0Var2;
                                    mutableState3 = mutableState2;
                                    obj = H2;
                                    context3 = context2;
                                    str2 = str8;
                                    sharedPreferences3 = sharedPreferences2;
                                    uaVar = uaVar2;
                                    i3 = 0;
                                    str3 = (String) obj;
                                    if (str3 == null && (p = p(str3)) != null && d41.E(p, str2)) {
                                        fi0Var.d = true;
                                        ji0Var.d = p;
                                    }
                                    uaVar.d = mutableState3;
                                    uaVar.e = sharedPreferences3;
                                    uaVar.f = context3;
                                    uaVar.g = it2;
                                    uaVar.h = q90Var;
                                    uaVar.i = str2;
                                    uaVar.j = fi0Var;
                                    str4 = null;
                                    uaVar.k = null;
                                    uaVar.l = ji0Var;
                                    uaVar.m = z3;
                                    uaVar.n = i4;
                                    uaVar.o = i3;
                                    uaVar.q = 2;
                                    nq nqVar3 = nr.a;
                                    i5 = i4;
                                    H = p01.H(hq.d, new qe(str, (hm) (0 == true ? 1 : 0), 8), uaVar);
                                    if (H != vnVar) {
                                        sharedPreferences4 = sharedPreferences3;
                                        boolean booleanValue2 = ((Boolean) H).booleanValue();
                                        if (fi0Var.d) {
                                        }
                                        String d2 = fi0Var.d ? uo.d("Installed (v", str2, ")") : "Update Available (" + ji0Var.d + ")";
                                        List<sa> list22 = (List) mutableState3.getValue();
                                        ArrayList arrayList22 = new ArrayList(zi.a0(list22, 10));
                                        while (r2.hasNext()) {
                                        }
                                        mutableState3.setValue(arrayList22);
                                        uaVar2 = uaVar;
                                        z2 = z3;
                                        it = it2;
                                        context2 = context3;
                                        sharedPreferences2 = sharedPreferences4;
                                        str5 = str4;
                                        mutableState2 = mutableState3;
                                        i2 = i5;
                                        if (!it.hasNext()) {
                                            return w01.a;
                                        }
                                    }
                                }
                                return vnVar;
                            }
                        }
                        i5 = i2;
                        mutableState3 = mutableState2;
                        str4 = str5;
                        str5 = str4;
                        mutableState2 = mutableState3;
                        i2 = i5;
                        if (!it.hasNext()) {
                        }
                    }
                }
            }
        }
        uaVar = new ua(imVar);
        Object obj3 = uaVar.p;
        i = uaVar.q;
        String str52 = null;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        if (d(r11, r9, r6, r12, r13) != r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (i(r6, r7, r8, r9, r10, r11, r12, r13) == r5) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState3, boolean z, im imVar) {
        va vaVar;
        int i;
        if (imVar instanceof va) {
            vaVar = (va) imVar;
            int i2 = vaVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vaVar.i = i2 - Integer.MIN_VALUE;
                va vaVar2 = vaVar;
                Object obj = vaVar2.h;
                i = vaVar2.i;
                vn vnVar = vn.d;
                if (i != 0) {
                    p10.Q(obj);
                    vaVar2.d = context;
                    vaVar2.e = sharedPreferences;
                    vaVar2.f = mutableState3;
                    vaVar2.g = z;
                    vaVar2.i = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            p10.Q(obj);
                            return w01.a;
                        }
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = vaVar2.g;
                    mutableState3 = vaVar2.f;
                    sharedPreferences = vaVar2.e;
                    context = vaVar2.d;
                    p10.Q(obj);
                }
                vaVar2.d = null;
                vaVar2.e = null;
                vaVar2.f = null;
                vaVar2.g = z;
                vaVar2.i = 2;
            }
        }
        vaVar = new va(imVar);
        va vaVar22 = vaVar;
        Object obj2 = vaVar22.h;
        i = vaVar22.i;
        vn vnVar2 = vn.d;
        if (i != 0) {
        }
        vaVar22.d = null;
        vaVar22.e = null;
        vaVar22.f = null;
        vaVar22.g = z;
        vaVar22.i = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x021c, code lost:
    
        if (r7 == r13) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bf  */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0541 -> B:12:0x0556). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0584 -> B:20:0x057f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, MutableState mutableState3, boolean z, im imVar) {
        db dbVar;
        int i;
        SharedPreferences sharedPreferences2;
        MutableState mutableState4;
        Object i2;
        MutableState mutableState5;
        boolean z2;
        Object obj;
        SharedPreferences sharedPreferences3;
        MutableState mutableState6;
        List list;
        Context context2;
        int i3;
        Set set;
        boolean z3;
        SharedPreferences sharedPreferences4;
        ArrayList arrayList;
        Context context3;
        Iterator it;
        int i4;
        int i5;
        Object obj2;
        MutableState mutableState7;
        MutableState mutableState8;
        Object obj3;
        q90 q90Var;
        ArrayList arrayList2;
        String str;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList3;
        vn vnVar;
        Iterator it2;
        boolean z4;
        int i9;
        Set set2;
        int i10;
        Context context4;
        Set set3;
        q90 q90Var2;
        Iterator it3;
        ArrayList arrayList4;
        int i11;
        String str2;
        ArrayList arrayList5;
        int i12;
        int i13;
        Object obj4;
        db dbVar2;
        boolean z5;
        int i14;
        MutableState mutableState9;
        boolean z6;
        vn vnVar2;
        boolean z7;
        boolean z8;
        int i15;
        int i16;
        boolean z9;
        int i17;
        int i18;
        boolean z10;
        int i19;
        vn vnVar3;
        ArrayList arrayList6;
        q90 q90Var3;
        ji0 ji0Var;
        fi0 fi0Var;
        int i20;
        boolean z11;
        boolean z12;
        int i21;
        int i22;
        int i23;
        q90 q90Var4;
        ji0 ji0Var2;
        String str3;
        boolean z13;
        vn vnVar4;
        boolean z14;
        boolean z15;
        MutableState mutableState10;
        int i24;
        int i25;
        boolean z16;
        fi0 fi0Var2;
        q90 q90Var5;
        int i26;
        Context context5;
        int i27;
        ji0 ji0Var3;
        boolean z17;
        int i28;
        q90 q90Var6;
        Object obj5;
        int i29;
        int i30;
        MutableState mutableState11;
        String str4;
        String str5;
        String str6;
        ArrayList arrayList7;
        boolean z18;
        q90 q90Var7;
        int i31;
        boolean z19;
        boolean z20;
        boolean booleanValue;
        int i32;
        int i33;
        String str7;
        String str8;
        boolean z21;
        String m;
        Context context6 = context;
        MutableState mutableState12 = mutableState;
        MutableState mutableState13 = mutableState2;
        boolean z22 = z;
        if (imVar instanceof db) {
            dbVar = (db) imVar;
            int i34 = dbVar.D;
            if ((i34 & Integer.MIN_VALUE) != 0) {
                dbVar.D = i34 - Integer.MIN_VALUE;
                Object obj6 = dbVar.C;
                i = dbVar.D;
                vn vnVar5 = vn.d;
                switch (i) {
                    case 0:
                        p10.Q(obj6);
                        mutableState12.setValue(Boolean.TRUE);
                        mutableState13.setValue(null);
                        dbVar.d = context6;
                        dbVar.e = mutableState12;
                        dbVar.f = mutableState13;
                        sharedPreferences2 = sharedPreferences;
                        dbVar.g = sharedPreferences2;
                        mutableState4 = mutableState3;
                        dbVar.h = mutableState4;
                        dbVar.t = z22;
                        dbVar.D = 1;
                        i2 = ts.m.i(context6, "Lumince", "Singularity-Magisk-Repo", z22, 3600000L, dbVar);
                        break;
                    case 1:
                        boolean z23 = dbVar.t;
                        MutableState mutableState14 = dbVar.h;
                        SharedPreferences sharedPreferences5 = dbVar.g;
                        MutableState mutableState15 = dbVar.f;
                        MutableState mutableState16 = dbVar.e;
                        Context context7 = dbVar.d;
                        p10.Q(obj6);
                        z22 = z23;
                        context6 = context7;
                        i2 = ((kj0) obj6).d;
                        sharedPreferences2 = sharedPreferences5;
                        mutableState13 = mutableState15;
                        mutableState4 = mutableState14;
                        mutableState12 = mutableState16;
                        if (!(i2 instanceof jj0)) {
                            List list2 = (List) i2;
                            dbVar.d = context6;
                            dbVar.e = mutableState12;
                            dbVar.f = mutableState13;
                            dbVar.g = sharedPreferences2;
                            dbVar.h = mutableState4;
                            dbVar.i = i2;
                            dbVar.j = list2;
                            dbVar.t = z22;
                            dbVar.w = 0;
                            dbVar.D = 2;
                            nq nqVar = nr.a;
                            Object H = p01.H(hq.d, new b80(2, 5, null), dbVar);
                            if (H != vnVar5) {
                                mutableState5 = mutableState12;
                                z2 = z22;
                                obj = i2;
                                sharedPreferences3 = sharedPreferences2;
                                obj6 = H;
                                mutableState6 = mutableState13;
                                list = list2;
                                context2 = context6;
                                i3 = 0;
                                set = (Set) obj6;
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj7 : list) {
                                    if (((q90) obj7).a()) {
                                        arrayList8.add(obj7);
                                    }
                                }
                                z3 = z2;
                                mutableState12 = mutableState5;
                                sharedPreferences4 = sharedPreferences3;
                                i2 = obj;
                                arrayList = new ArrayList(zi.a0(arrayList8, 10));
                                context3 = context2;
                                it = arrayList8.iterator();
                                i4 = 0;
                                i5 = 0;
                                if (!it.hasNext()) {
                                    q90 q90Var8 = (q90) it.next();
                                    ArrayList arrayList9 = arrayList;
                                    String str9 = q90Var8.a;
                                    Set set4 = set;
                                    String string = sharedPreferences4.getString("magisk_module_id_".concat(str9), str9);
                                    if (string != null) {
                                        str9 = string;
                                    }
                                    dbVar.d = context3;
                                    dbVar.e = mutableState12;
                                    dbVar.f = mutableState6;
                                    dbVar.g = sharedPreferences4;
                                    dbVar.h = mutableState4;
                                    dbVar.i = i2;
                                    dbVar.j = null;
                                    dbVar.k = set4;
                                    ArrayList arrayList10 = arrayList9;
                                    dbVar.l = arrayList10;
                                    dbVar.m = it;
                                    dbVar.n = q90Var8;
                                    dbVar.o = arrayList10;
                                    dbVar.p = str9;
                                    dbVar.q = null;
                                    dbVar.r = null;
                                    dbVar.s = null;
                                    dbVar.t = z3;
                                    dbVar.w = i3;
                                    dbVar.x = i4;
                                    dbVar.y = i5;
                                    dbVar.z = 0;
                                    dbVar.D = 3;
                                    nq nqVar2 = nr.a;
                                    int i35 = i3;
                                    MutableState mutableState17 = mutableState12;
                                    boolean z24 = z3;
                                    Object H2 = p01.H(hq.d, new qe(str9, (hm) null, 7), dbVar);
                                    if (H2 != vnVar5) {
                                        Iterator it4 = it;
                                        obj2 = i2;
                                        i6 = i4;
                                        z4 = z24;
                                        vnVar = vnVar5;
                                        it2 = it4;
                                        set2 = set4;
                                        i7 = i35;
                                        mutableState8 = mutableState17;
                                        arrayList3 = arrayList9;
                                        arrayList2 = arrayList3;
                                        obj3 = H2;
                                        q90Var = q90Var8;
                                        mutableState7 = mutableState4;
                                        i9 = i5;
                                        str = str9;
                                        i8 = 0;
                                        Boolean bool = (Boolean) obj3;
                                        int i36 = i8;
                                        booleanValue = bool.booleanValue();
                                        boolean contains = set2.contains(str);
                                        if (!booleanValue || contains) {
                                            set3 = set2;
                                            i32 = 1;
                                        } else {
                                            set3 = set2;
                                            i32 = 0;
                                        }
                                        if (booleanValue) {
                                            int i37 = i7;
                                            i18 = i32;
                                            mutableState9 = mutableState8;
                                            i31 = i37;
                                            z10 = contains;
                                            q90Var7 = q90Var;
                                            z19 = z4;
                                            str6 = str;
                                            arrayList4 = arrayList2;
                                            i12 = i9;
                                            i13 = i6;
                                            arrayList7 = arrayList3;
                                            i17 = 1;
                                            i15 = i36;
                                            dbVar2 = dbVar;
                                            z18 = booleanValue;
                                            fi0 fi0Var3 = new fi0();
                                            z20 = z18;
                                            ji0 ji0Var4 = new ji0();
                                            if (z20) {
                                            }
                                        } else {
                                            dbVar.d = context3;
                                            dbVar.e = mutableState8;
                                            dbVar.f = mutableState6;
                                            dbVar.g = sharedPreferences4;
                                            dbVar.h = mutableState7;
                                            dbVar.i = obj2;
                                            MutableState mutableState18 = mutableState8;
                                            dbVar.j = null;
                                            dbVar.k = set3;
                                            dbVar.l = arrayList2;
                                            dbVar.m = it2;
                                            dbVar.n = q90Var;
                                            dbVar.o = arrayList3;
                                            dbVar.p = str;
                                            dbVar.t = z4;
                                            dbVar.w = i7;
                                            dbVar.x = i6;
                                            dbVar.y = i9;
                                            dbVar.z = i36;
                                            dbVar.u = booleanValue;
                                            dbVar.v = contains;
                                            dbVar.A = i32;
                                            int i38 = i32;
                                            dbVar.D = 4;
                                            nq nqVar3 = nr.a;
                                            int i39 = i7;
                                            Object H3 = p01.H(hq.d, new qe(str, (hm) null, 6), dbVar);
                                            vnVar2 = vnVar;
                                            if (H3 == vnVar2) {
                                                return vnVar2;
                                            }
                                            mutableState9 = mutableState18;
                                            z6 = contains;
                                            q90Var2 = q90Var;
                                            it3 = it2;
                                            arrayList5 = arrayList3;
                                            arrayList4 = arrayList2;
                                            i10 = i38;
                                            z5 = booleanValue;
                                            z7 = z4;
                                            str2 = str;
                                            i12 = i9;
                                            i13 = i6;
                                            obj4 = H3;
                                            dbVar2 = dbVar;
                                            context4 = context3;
                                            i14 = i36;
                                            i11 = i39;
                                            str6 = str2;
                                            arrayList7 = arrayList5;
                                            vnVar = vnVar2;
                                            i31 = i11;
                                            context3 = context4;
                                            z19 = z7;
                                            it2 = it3;
                                            z10 = z6;
                                            q90Var7 = q90Var2;
                                            i18 = i10;
                                            i17 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                                            i15 = i14;
                                            z18 = z5;
                                            fi0 fi0Var32 = new fi0();
                                            z20 = z18;
                                            ji0 ji0Var42 = new ji0();
                                            if (z20) {
                                                dbVar2.d = context3;
                                                dbVar2.e = mutableState9;
                                                dbVar2.f = mutableState6;
                                                dbVar2.g = sharedPreferences4;
                                                dbVar2.h = mutableState7;
                                                dbVar2.i = obj2;
                                                MutableState mutableState19 = mutableState9;
                                                dbVar2.j = null;
                                                dbVar2.k = set3;
                                                dbVar2.l = arrayList4;
                                                dbVar2.m = it2;
                                                dbVar2.n = q90Var7;
                                                dbVar2.o = arrayList7;
                                                dbVar2.p = null;
                                                dbVar2.q = fi0Var32;
                                                dbVar2.r = ji0Var42;
                                                dbVar2.t = z19;
                                                dbVar2.w = i31;
                                                dbVar2.x = i13;
                                                dbVar2.y = i12;
                                                dbVar2.z = i15;
                                                dbVar2.u = z20;
                                                boolean z25 = z19;
                                                dbVar2.v = z10;
                                                dbVar2.A = i18;
                                                dbVar2.B = i17;
                                                dbVar2.D = 5;
                                                nq nqVar4 = nr.a;
                                                i19 = i31;
                                                q90 q90Var9 = q90Var7;
                                                obj6 = p01.H(hq.d, new qe(str6, (hm) null, 5), dbVar2);
                                                vnVar3 = vnVar;
                                                if (obj6 == vnVar3) {
                                                    return vnVar3;
                                                }
                                                mutableState9 = mutableState19;
                                                z8 = z20;
                                                q90Var3 = q90Var9;
                                                fi0Var = fi0Var32;
                                                arrayList6 = arrayList7;
                                                ji0Var = ji0Var42;
                                                dbVar = dbVar2;
                                                i16 = i12;
                                                z9 = z25;
                                                str5 = (String) obj6;
                                                if (str5 == null) {
                                                    fi0 fi0Var4 = fi0Var;
                                                    vnVar = vnVar3;
                                                    str3 = m(str5);
                                                    fi0Var32 = fi0Var4;
                                                    boolean z26 = z10;
                                                    z11 = z8;
                                                    ji0Var2 = ji0Var;
                                                    i21 = i18;
                                                    z12 = z26;
                                                    z13 = z9;
                                                    i12 = i16;
                                                } else {
                                                    boolean z27 = z10;
                                                    z11 = z8;
                                                    ji0Var2 = ji0Var;
                                                    i21 = i18;
                                                    z12 = z27;
                                                    z13 = z9;
                                                    fi0Var32 = fi0Var;
                                                    vnVar = vnVar3;
                                                    i12 = i16;
                                                    str3 = null;
                                                }
                                                dbVar2 = dbVar;
                                                q90Var4 = q90Var3;
                                                i20 = i15;
                                                i23 = i13;
                                                i22 = i19;
                                                if (str3 != null) {
                                                    dbVar2.d = context3;
                                                    dbVar2.e = mutableState9;
                                                    dbVar2.f = mutableState6;
                                                    dbVar2.g = sharedPreferences4;
                                                    dbVar2.h = mutableState7;
                                                    dbVar2.i = obj2;
                                                    MutableState mutableState20 = mutableState9;
                                                    dbVar2.j = null;
                                                    dbVar2.k = set3;
                                                    dbVar2.l = arrayList4;
                                                    dbVar2.m = it2;
                                                    dbVar2.n = q90Var4;
                                                    dbVar2.o = arrayList6;
                                                    dbVar2.p = null;
                                                    dbVar2.q = fi0Var32;
                                                    dbVar2.r = ji0Var2;
                                                    dbVar2.s = str3;
                                                    dbVar2.t = z13;
                                                    dbVar2.w = i22;
                                                    dbVar2.x = i23;
                                                    dbVar2.y = i12;
                                                    dbVar2.z = i20;
                                                    boolean z28 = z11;
                                                    dbVar2.u = z28;
                                                    z15 = z13;
                                                    dbVar2.v = z12;
                                                    dbVar2.A = i21;
                                                    dbVar2.B = i17;
                                                    dbVar2.D = 6;
                                                    nq nqVar5 = nr.a;
                                                    String str10 = str3;
                                                    z17 = z28;
                                                    ji0 ji0Var5 = ji0Var2;
                                                    Object H4 = p01.H(hq.d, new w3(q90Var4, context3, null, 3), dbVar2);
                                                    vnVar4 = vnVar;
                                                    if (H4 == vnVar4) {
                                                        return vnVar4;
                                                    }
                                                    mutableState10 = mutableState20;
                                                    i24 = i23;
                                                    i28 = i12;
                                                    ji0Var3 = ji0Var5;
                                                    q90Var6 = q90Var4;
                                                    obj5 = H4;
                                                    i29 = i17;
                                                    i30 = i22;
                                                    fi0Var2 = fi0Var32;
                                                    i26 = i21;
                                                    mutableState11 = mutableState6;
                                                    str4 = str10;
                                                    str8 = (String) obj5;
                                                    if (str8 == null && (m = m(str8)) != null && d41.E(m, str4)) {
                                                        z21 = true;
                                                        fi0Var2.d = true;
                                                        ji0Var3.d = m;
                                                    } else {
                                                        z21 = true;
                                                    }
                                                    int i40 = i30;
                                                    i17 = i29;
                                                    i25 = i40;
                                                    dbVar = dbVar2;
                                                    z14 = z21;
                                                    i2 = obj2;
                                                    mutableState6 = mutableState11;
                                                    it = it2;
                                                    context5 = context3;
                                                    i27 = i28;
                                                    z16 = z17;
                                                    q90Var5 = q90Var6;
                                                    boolean z29 = z12;
                                                    ArrayList arrayList11 = arrayList6;
                                                    if (i26 == 0) {
                                                        str7 = "Not installed";
                                                    } else if (!z16 && z29) {
                                                        str7 = "Installed (pending first boot)";
                                                    } else if (i17 != 0) {
                                                        if (fi0Var2.d) {
                                                            i33 = i25;
                                                            str7 = "Update Available (" + ji0Var3.d + ")";
                                                        } else {
                                                            i33 = i25;
                                                            str7 = z29 ? "Installed (pending reboot)" : "Installed";
                                                        }
                                                        arrayList11.add(new sa(q90Var5, str7, i26 == 0 ? z14 : false, i17 == 0 ? z14 : false, (String) null, fi0Var2.d, (String) ji0Var3.d, z29, 32));
                                                        i3 = i33;
                                                        i5 = i27;
                                                        context3 = context5;
                                                        mutableState4 = mutableState7;
                                                        i4 = i24;
                                                        set = set3;
                                                        z3 = z15;
                                                        arrayList = arrayList4;
                                                        vnVar5 = vnVar4;
                                                        mutableState12 = mutableState10;
                                                        if (!it.hasNext()) {
                                                            mutableState4.setValue(arrayList);
                                                            mutableState13 = mutableState6;
                                                        }
                                                    } else {
                                                        str7 = "Installed (disabled)";
                                                    }
                                                    i33 = i25;
                                                    arrayList11.add(new sa(q90Var5, str7, i26 == 0 ? z14 : false, i17 == 0 ? z14 : false, (String) null, fi0Var2.d, (String) ji0Var3.d, z29, 32));
                                                    i3 = i33;
                                                    i5 = i27;
                                                    context3 = context5;
                                                    mutableState4 = mutableState7;
                                                    i4 = i24;
                                                    set = set3;
                                                    z3 = z15;
                                                    arrayList = arrayList4;
                                                    vnVar5 = vnVar4;
                                                    mutableState12 = mutableState10;
                                                    if (!it.hasNext()) {
                                                    }
                                                } else {
                                                    vnVar4 = vnVar;
                                                    boolean z30 = z11;
                                                    z14 = true;
                                                    z15 = z13;
                                                    mutableState10 = mutableState9;
                                                    i24 = i23;
                                                    i25 = i22;
                                                    z16 = z30;
                                                    fi0Var2 = fi0Var32;
                                                    q90Var5 = q90Var4;
                                                    dbVar = dbVar2;
                                                    i2 = obj2;
                                                    i26 = i21;
                                                    it = it2;
                                                    context5 = context3;
                                                    i27 = i12;
                                                    ji0Var3 = ji0Var2;
                                                    boolean z292 = z12;
                                                    ArrayList arrayList112 = arrayList6;
                                                    if (i26 == 0) {
                                                    }
                                                    i33 = i25;
                                                    arrayList112.add(new sa(q90Var5, str7, i26 == 0 ? z14 : false, i17 == 0 ? z14 : false, (String) null, fi0Var2.d, (String) ji0Var3.d, z292, 32));
                                                    i3 = i33;
                                                    i5 = i27;
                                                    context3 = context5;
                                                    mutableState4 = mutableState7;
                                                    i4 = i24;
                                                    set = set3;
                                                    z3 = z15;
                                                    arrayList = arrayList4;
                                                    vnVar5 = vnVar4;
                                                    mutableState12 = mutableState10;
                                                    if (!it.hasNext()) {
                                                    }
                                                }
                                            } else {
                                                q90 q90Var10 = q90Var7;
                                                z13 = z19;
                                                ji0Var2 = ji0Var42;
                                                i20 = i15;
                                                i23 = i13;
                                                i22 = i31;
                                                arrayList6 = arrayList7;
                                                i21 = i18;
                                                z12 = z10;
                                                str3 = null;
                                                z11 = z20;
                                                q90Var4 = q90Var10;
                                                if (str3 != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return vnVar5;
                        }
                        Throwable a2 = kj0.a(i2);
                        if (a2 != null) {
                            String message = a2.getMessage();
                            if (message == null) {
                                message = "Failed to load the Magisk module catalog.";
                            }
                            mutableState13.setValue(message);
                        }
                        mutableState12.setValue(Boolean.FALSE);
                        return w01.a;
                    case 2:
                        i3 = dbVar.w;
                        z2 = dbVar.t;
                        list = dbVar.j;
                        obj = dbVar.i;
                        mutableState4 = dbVar.h;
                        sharedPreferences3 = dbVar.g;
                        mutableState6 = dbVar.f;
                        mutableState5 = dbVar.e;
                        context2 = dbVar.d;
                        p10.Q(obj6);
                        set = (Set) obj6;
                        ArrayList arrayList82 = new ArrayList();
                        while (r2.hasNext()) {
                        }
                        z3 = z2;
                        mutableState12 = mutableState5;
                        sharedPreferences4 = sharedPreferences3;
                        i2 = obj;
                        arrayList = new ArrayList(zi.a0(arrayList82, 10));
                        context3 = context2;
                        it = arrayList82.iterator();
                        i4 = 0;
                        i5 = 0;
                        if (!it.hasNext()) {
                        }
                        break;
                    case 3:
                        int i41 = dbVar.z;
                        int i42 = dbVar.y;
                        int i43 = dbVar.x;
                        int i44 = dbVar.w;
                        boolean z31 = dbVar.t;
                        String str11 = dbVar.p;
                        Collection collection = dbVar.o;
                        q90 q90Var11 = dbVar.n;
                        Iterator it5 = dbVar.m;
                        Collection collection2 = dbVar.l;
                        Set set5 = dbVar.k;
                        obj2 = dbVar.i;
                        mutableState7 = dbVar.h;
                        SharedPreferences sharedPreferences6 = dbVar.g;
                        MutableState mutableState21 = dbVar.f;
                        MutableState mutableState22 = dbVar.e;
                        Context context8 = dbVar.d;
                        p10.Q(obj6);
                        mutableState8 = mutableState22;
                        obj3 = obj6;
                        q90Var = q90Var11;
                        sharedPreferences4 = sharedPreferences6;
                        arrayList2 = collection2;
                        str = str11;
                        i6 = i43;
                        i7 = i44;
                        i8 = i41;
                        arrayList3 = collection;
                        mutableState6 = mutableState21;
                        vnVar = vnVar5;
                        it2 = it5;
                        z4 = z31;
                        i9 = i42;
                        context3 = context8;
                        set2 = set5;
                        Boolean bool2 = (Boolean) obj3;
                        int i362 = i8;
                        booleanValue = bool2.booleanValue();
                        boolean contains2 = set2.contains(str);
                        if (booleanValue) {
                        }
                        set3 = set2;
                        i32 = 1;
                        if (booleanValue) {
                        }
                        break;
                    case 4:
                        int i45 = dbVar.A;
                        boolean z32 = dbVar.v;
                        boolean z33 = dbVar.u;
                        int i46 = dbVar.z;
                        int i47 = dbVar.y;
                        int i48 = dbVar.x;
                        int i49 = dbVar.w;
                        boolean z34 = dbVar.t;
                        String str12 = dbVar.p;
                        Collection collection3 = dbVar.o;
                        q90 q90Var12 = dbVar.n;
                        Iterator it6 = dbVar.m;
                        Collection collection4 = dbVar.l;
                        i10 = i45;
                        Set set6 = dbVar.k;
                        Object obj8 = dbVar.i;
                        MutableState mutableState23 = dbVar.h;
                        SharedPreferences sharedPreferences7 = dbVar.g;
                        MutableState mutableState24 = dbVar.f;
                        MutableState mutableState25 = dbVar.e;
                        context4 = dbVar.d;
                        p10.Q(obj6);
                        set3 = set6;
                        q90Var2 = q90Var12;
                        it3 = it6;
                        arrayList4 = collection4;
                        obj2 = obj8;
                        mutableState7 = mutableState23;
                        i11 = i49;
                        str2 = str12;
                        arrayList5 = collection3;
                        mutableState6 = mutableState24;
                        i12 = i47;
                        i13 = i48;
                        obj4 = obj6;
                        dbVar2 = dbVar;
                        z5 = z33;
                        i14 = i46;
                        mutableState9 = mutableState25;
                        z6 = z32;
                        vnVar2 = vnVar5;
                        z7 = z34;
                        sharedPreferences4 = sharedPreferences7;
                        str6 = str2;
                        arrayList7 = arrayList5;
                        vnVar = vnVar2;
                        i31 = i11;
                        context3 = context4;
                        z19 = z7;
                        it2 = it3;
                        z10 = z6;
                        q90Var7 = q90Var2;
                        i18 = i10;
                        i17 = ((Boolean) obj4).booleanValue() ? 1 : 0;
                        i15 = i14;
                        z18 = z5;
                        fi0 fi0Var322 = new fi0();
                        z20 = z18;
                        ji0 ji0Var422 = new ji0();
                        if (z20) {
                        }
                        break;
                    case 5:
                        int i50 = dbVar.B;
                        int i51 = dbVar.A;
                        boolean z35 = dbVar.v;
                        z8 = dbVar.u;
                        i15 = dbVar.z;
                        i16 = dbVar.y;
                        int i52 = dbVar.x;
                        int i53 = dbVar.w;
                        z9 = dbVar.t;
                        ji0 ji0Var6 = dbVar.r;
                        fi0 fi0Var5 = dbVar.q;
                        Collection collection5 = dbVar.o;
                        q90 q90Var13 = dbVar.n;
                        i17 = i50;
                        Iterator it7 = dbVar.m;
                        Collection collection6 = dbVar.l;
                        Set set7 = dbVar.k;
                        Object obj9 = dbVar.i;
                        MutableState mutableState26 = dbVar.h;
                        SharedPreferences sharedPreferences8 = dbVar.g;
                        MutableState mutableState27 = dbVar.f;
                        MutableState mutableState28 = dbVar.e;
                        Context context9 = dbVar.d;
                        p10.Q(obj6);
                        arrayList4 = collection6;
                        set3 = set7;
                        i18 = i51;
                        z10 = z35;
                        i19 = i53;
                        vnVar3 = vnVar5;
                        arrayList6 = collection5;
                        q90Var3 = q90Var13;
                        it2 = it7;
                        obj2 = obj9;
                        mutableState7 = mutableState26;
                        sharedPreferences4 = sharedPreferences8;
                        mutableState9 = mutableState28;
                        ji0Var = ji0Var6;
                        fi0Var = fi0Var5;
                        context3 = context9;
                        i13 = i52;
                        mutableState6 = mutableState27;
                        str5 = (String) obj6;
                        if (str5 == null) {
                        }
                        dbVar2 = dbVar;
                        q90Var4 = q90Var3;
                        i20 = i15;
                        i23 = i13;
                        i22 = i19;
                        if (str3 != null) {
                        }
                        break;
                    case 6:
                        int i54 = dbVar.B;
                        int i55 = dbVar.A;
                        boolean z36 = dbVar.v;
                        boolean z37 = dbVar.u;
                        i28 = dbVar.y;
                        int i56 = dbVar.x;
                        int i57 = dbVar.w;
                        boolean z38 = dbVar.t;
                        str4 = dbVar.s;
                        ji0 ji0Var7 = dbVar.r;
                        fi0Var2 = dbVar.q;
                        Collection collection7 = dbVar.o;
                        q90 q90Var14 = dbVar.n;
                        Iterator it8 = dbVar.m;
                        Collection collection8 = dbVar.l;
                        Set set8 = dbVar.k;
                        Object obj10 = dbVar.i;
                        MutableState mutableState29 = dbVar.h;
                        SharedPreferences sharedPreferences9 = dbVar.g;
                        mutableState11 = dbVar.f;
                        mutableState10 = dbVar.e;
                        Context context10 = dbVar.d;
                        p10.Q(obj6);
                        arrayList4 = collection8;
                        set3 = set8;
                        z12 = z36;
                        z17 = z37;
                        z15 = z38;
                        arrayList6 = collection7;
                        q90Var6 = q90Var14;
                        i24 = i56;
                        obj2 = obj10;
                        context3 = context10;
                        dbVar2 = dbVar;
                        ji0Var3 = ji0Var7;
                        sharedPreferences4 = sharedPreferences9;
                        i29 = i54;
                        obj5 = obj6;
                        i30 = i57;
                        mutableState7 = mutableState29;
                        i26 = i55;
                        vnVar4 = vnVar5;
                        it2 = it8;
                        str8 = (String) obj5;
                        if (str8 == null) {
                            break;
                        }
                        z21 = true;
                        int i402 = i30;
                        i17 = i29;
                        i25 = i402;
                        dbVar = dbVar2;
                        z14 = z21;
                        i2 = obj2;
                        mutableState6 = mutableState11;
                        it = it2;
                        context5 = context3;
                        i27 = i28;
                        z16 = z17;
                        q90Var5 = q90Var6;
                        boolean z2922 = z12;
                        ArrayList arrayList1122 = arrayList6;
                        if (i26 == 0) {
                        }
                        i33 = i25;
                        arrayList1122.add(new sa(q90Var5, str7, i26 == 0 ? z14 : false, i17 == 0 ? z14 : false, (String) null, fi0Var2.d, (String) ji0Var3.d, z2922, 32));
                        i3 = i33;
                        i5 = i27;
                        context3 = context5;
                        mutableState4 = mutableState7;
                        i4 = i24;
                        set = set3;
                        z3 = z15;
                        arrayList = arrayList4;
                        vnVar5 = vnVar4;
                        mutableState12 = mutableState10;
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dbVar = new db(imVar);
        Object obj62 = dbVar.C;
        i = dbVar.D;
        vn vnVar52 = vn.d;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, boolean z, im imVar) {
        eb ebVar;
        int i;
        MutableState mutableState4;
        Object i2;
        Throwable a2;
        String str;
        MutableState mutableState5 = mutableState;
        MutableState mutableState6 = mutableState2;
        if (imVar instanceof eb) {
            ebVar = (eb) imVar;
            int i3 = ebVar.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ebVar.h = i3 - Integer.MIN_VALUE;
                Object obj = ebVar.g;
                i = ebVar.h;
                if (i != 0) {
                    p10.Q(obj);
                    mutableState5.setValue(Boolean.TRUE);
                    mutableState6.setValue(null);
                    ebVar.d = mutableState5;
                    ebVar.e = mutableState6;
                    mutableState4 = mutableState3;
                    ebVar.f = mutableState4;
                    ebVar.h = 1;
                    i2 = ts.m.i(context, "Lumince", "Singularity-Apps-repo", z, 3600000L, ebVar);
                    vn vnVar = vn.d;
                    if (i2 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState7 = ebVar.f;
                    mutableState6 = ebVar.e;
                    MutableState mutableState8 = ebVar.d;
                    p10.Q(obj);
                    Object obj2 = ((kj0) obj).d;
                    mutableState4 = mutableState7;
                    mutableState5 = mutableState8;
                    i2 = obj2;
                }
                if (!(i2 instanceof jj0)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) i2) {
                        q90 q90Var = (q90) obj3;
                        if (q90Var.a() && (str = q90Var.i) != null && !ds0.n0(str)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(zi.a0(arrayList, 10));
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj4 = arrayList.get(i4);
                        i4++;
                        q90 q90Var2 = (q90) obj4;
                        String str2 = q90Var2.b;
                        String str3 = q90Var2.c;
                        String str4 = q90Var2.i;
                        str4.getClass();
                        arrayList2.add(new b8(str2, str3, str4, new cb(q90Var2, (hm) null), q90Var2.e, q90Var2.f, 16));
                    }
                    mutableState4.setValue(arrayList2);
                }
                a2 = kj0.a(i2);
                if (a2 != null) {
                    String message = a2.getMessage();
                    if (message == null) {
                        message = "Failed to load the app catalog.";
                    }
                    mutableState6.setValue(message);
                }
                mutableState5.setValue(Boolean.FALSE);
                return w01.a;
            }
        }
        ebVar = new eb(imVar);
        Object obj5 = ebVar.g;
        i = ebVar.h;
        if (i != 0) {
        }
        if (!(i2 instanceof jj0)) {
        }
        a2 = kj0.a(i2);
        if (a2 != null) {
        }
        mutableState5.setValue(Boolean.FALSE);
        return w01.a;
    }

    public static final void h(un unVar, Context context, MutableState mutableState, MutableState mutableState2) {
        nq nqVar = nr.a;
        p01.t(unVar, hq.d, null, new fb(context, mutableState, mutableState2, null, 0), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(Context context, MutableState mutableState, MutableState mutableState2, SharedPreferences sharedPreferences, PackageManager packageManager, MutableState mutableState3, boolean z, im imVar) {
        gb gbVar;
        int i;
        SharedPreferences sharedPreferences2;
        PackageManager packageManager2;
        MutableState mutableState4;
        Object i2;
        Throwable a2;
        String str;
        MutableState mutableState5 = mutableState;
        MutableState mutableState6 = mutableState2;
        if (imVar instanceof gb) {
            gbVar = (gb) imVar;
            int i3 = gbVar.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gbVar.j = i3 - Integer.MIN_VALUE;
                Object obj = gbVar.i;
                i = gbVar.j;
                String str2 = null;
                boolean z2 = true;
                if (i != 0) {
                    p10.Q(obj);
                    mutableState5.setValue(Boolean.TRUE);
                    mutableState6.setValue(null);
                    gbVar.d = mutableState5;
                    gbVar.e = mutableState6;
                    sharedPreferences2 = sharedPreferences;
                    gbVar.f = sharedPreferences2;
                    packageManager2 = packageManager;
                    gbVar.g = packageManager2;
                    mutableState4 = mutableState3;
                    gbVar.h = mutableState4;
                    gbVar.j = 1;
                    i2 = ts.m.i(context, "Lumince", "Singularity-Vector-Repo", z, 3600000L, gbVar);
                    vn vnVar = vn.d;
                    if (i2 == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState7 = gbVar.h;
                    PackageManager packageManager3 = gbVar.g;
                    SharedPreferences sharedPreferences3 = gbVar.f;
                    MutableState mutableState8 = gbVar.e;
                    MutableState mutableState9 = gbVar.d;
                    p10.Q(obj);
                    mutableState4 = mutableState7;
                    mutableState5 = mutableState9;
                    i2 = ((kj0) obj).d;
                    sharedPreferences2 = sharedPreferences3;
                    packageManager2 = packageManager3;
                    mutableState6 = mutableState8;
                }
                if (!(i2 instanceof jj0)) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) i2) {
                        if (((q90) obj2).a()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(zi.a0(arrayList, 10));
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        q90 q90Var = (q90) obj3;
                        String string = sharedPreferences2.getString("vector_pkg_".concat(q90Var.a), str2);
                        if (string == null) {
                            string = q90Var.i;
                        }
                        if (string != null) {
                            packageManager2.getClass();
                            str = n(string, packageManager2);
                        } else {
                            str = str2;
                        }
                        String p = p(str);
                        boolean z3 = p != null ? z2 : false;
                        arrayList2.add(new sa(q90Var, z3 ? uo.d("Installed (v", p, ")") : "Ready", z3, true, p, false, (String) null, false, 448));
                        str2 = null;
                        z2 = true;
                    }
                    mutableState4.setValue(arrayList2);
                }
                a2 = kj0.a(i2);
                if (a2 != null) {
                    String message = a2.getMessage();
                    if (message == null) {
                        message = "Failed to load the Vector module catalog.";
                    }
                    mutableState6.setValue(message);
                }
                mutableState5.setValue(Boolean.FALSE);
                return w01.a;
            }
        }
        gbVar = new gb(imVar);
        Object obj4 = gbVar.i;
        i = gbVar.j;
        String str22 = null;
        boolean z22 = true;
        if (i != 0) {
        }
        if (!(i2 instanceof jj0)) {
        }
        a2 = kj0.a(i2);
        if (a2 != null) {
        }
        mutableState5.setValue(Boolean.FALSE);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(MutableState mutableState, MutableState mutableState2, im imVar) {
        hb hbVar;
        int i;
        if (imVar instanceof hb) {
            hbVar = (hb) imVar;
            int i2 = hbVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hbVar.g = i2 - Integer.MIN_VALUE;
                Object obj = hbVar.f;
                i = hbVar.g;
                hm hmVar = null;
                if (i != 0) {
                    p10.Q(obj);
                    mutableState.setValue(Boolean.TRUE);
                    hbVar.d = mutableState;
                    hbVar.e = mutableState2;
                    hbVar.g = 1;
                    nq nqVar = nr.a;
                    obj = p01.H(hq.d, new b80(2, 4, hmVar), hbVar);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState2 = hbVar.e;
                    mutableState = hbVar.d;
                    p10.Q(obj);
                }
                mutableState2.setValue((Boolean) obj);
                mutableState.setValue(Boolean.FALSE);
                return w01.a;
            }
        }
        hbVar = new hb(imVar);
        Object obj2 = hbVar.f;
        i = hbVar.g;
        hm hmVar2 = null;
        if (i != 0) {
        }
        mutableState2.setValue((Boolean) obj2);
        mutableState.setValue(Boolean.FALSE);
        return w01.a;
    }

    public static final void k(final Drawable drawable, String str, Modifier modifier, Composer composer, int i) {
        int i2;
        drawable.getClass();
        str.getClass();
        Composer startRestartGroup = composer.startRestartGroup(1814966880);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(drawable) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        final int i3 = 0;
        final int i4 = 1;
        if (startRestartGroup.shouldExecute((i2 & 131) != 130, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1814966880, i2, -1, "com.lumi.singularity.ui.activities.DrawableImage (AppsActivity.kt:1307)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(drawable);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ky() { // from class: f9
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        Drawable drawable2 = drawable;
                        switch (i5) {
                            case 0:
                                Context context = (Context) obj;
                                context.getClass();
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(drawable2);
                                return imageView;
                            default:
                                ImageView imageView2 = (ImageView) obj;
                                imageView2.getClass();
                                imageView2.setImageDrawable(drawable2);
                                return w01.a;
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ky kyVar = (ky) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(drawable);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new ky() { // from class: f9
                    @Override // defpackage.ky
                    public final Object invoke(Object obj) {
                        int i5 = i4;
                        Drawable drawable2 = drawable;
                        switch (i5) {
                            case 0:
                                Context context = (Context) obj;
                                context.getClass();
                                ImageView imageView = new ImageView(context);
                                imageView.setImageDrawable(drawable2);
                                return imageView;
                            default:
                                ImageView imageView2 = (ImageView) obj;
                                imageView2.getClass();
                                imageView2.setImageDrawable(drawable2);
                                return w01.a;
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView(kyVar, modifier, (ky) rememberedValue2, startRestartGroup, (i2 >> 3) & 112, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 1, drawable, str, modifier));
        }
    }

    public static final void l(iy iyVar, ky kyVar, Composer composer, int i) {
        int i2;
        Composer composer2;
        iyVar.getClass();
        kyVar.getClass();
        Composer startRestartGroup = composer.startRestartGroup(160380039);
        if ((i & 6) == 0) {
            i2 = i | (startRestartGroup.changedInstance(iyVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(kyVar) ? 32 : 16;
        }
        int i3 = i2;
        if (startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160380039, i3, -1, "com.lumi.singularity.ui.activities.LaunchStartAppOnBootDialog (AppsActivity.kt:1317)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = EffectsKt.createCompositionCoroutineScope(st.d, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ut.d, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState3 = (MutableState) rememberedValue4;
            List E = y80.E("com.oculus", "com.meta", "com.google", "com.facebook", "com.environment", "com.lumi.singularity", "com.topjohnwu.magisk", "com.singularity.magisk");
            boolean changedInstance = startRestartGroup.changedInstance(context);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                u3 u3Var = new u3(context, mutableState2, mutableState3, E, mutableState, (hm) null);
                startRestartGroup.updateRememberedValue(u3Var);
                rememberedValue5 = u3Var;
            }
            EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue5, startRestartGroup, 6);
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1600AlertDialogOix01E0(iyVar, wk.A, null, ComposableLambdaKt.rememberComposableLambda(1147143293, true, new l2(3, iyVar), startRestartGroup, 54), null, null, ComposableLambdaKt.rememberComposableLambda(868466266, true, new q8(kyVar, mutableState2, mutableState3, mutableState, 0), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, (i3 & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(iyVar, kyVar, i, 1));
        }
    }

    public static final String m(String str) {
        String str2;
        String obj = ds0.E0(str).toString();
        ni0 ni0Var = a;
        ni0Var.getClass();
        obj.getClass();
        Matcher matcher = ni0Var.d.matcher(obj);
        matcher.getClass();
        u80 n = cq.n(matcher, 0, obj);
        return (n == null || (str2 = (String) ((s80) n.a()).get(1)) == null) ? p(str) : str2;
    }

    public static final String n(String str, PackageManager packageManager) {
        str.getClass();
        packageManager.getClass();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final Boolean o(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(":\\s*(true|false)\\s*\\]");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        u80 n = cq.n(matcher, 0, str);
        if (n == null) {
            return null;
        }
        return Boolean.valueOf(q10.b(((s80) n.a()).get(1), "true"));
    }

    public static final String p(String str) {
        if (str == null) {
            return null;
        }
        return ds0.B0(ds0.B0(ds0.B0(str, ".r"), "_B"), "-");
    }
}

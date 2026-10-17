package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import defpackage.my;
import defpackage.w01;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__ProduceStateKt {
    public static final <T> State<T> produceState(T t, Object obj, Object obj2, Object obj3, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1807205155, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:170)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(myVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$4$1(myVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, obj2, obj3, (my) rememberedValue2, composer, (i >> 3) & 1022);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object obj, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928268701, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:107)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(myVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$2$1(myVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, (my) rememberedValue2, composer, (i >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object obj, Object obj2, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1703169085, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:138)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(myVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(myVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(obj, obj2, (my) rememberedValue2, composer, (i >> 3) & 126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10454275, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:77)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean changedInstance = composer.changedInstance(myVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(myVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(w01.a, (my) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> State<T> produceState(T t, Object[] objArr, my myVar, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(490154582, i, -1, "androidx.compose.runtime.produceState (ProduceState.kt:200)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changedInstance = composer.changedInstance(myVar);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(myVar, mutableState, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect(copyOf, (my) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}

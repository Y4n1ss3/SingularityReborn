package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import defpackage.ny;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ComposableSingletons$TimePickerKt {
    public static final ComposableSingletons$TimePickerKt INSTANCE = new ComposableSingletons$TimePickerKt();
    private static ny lambda$1425358052 = ComposableLambdaKt.composableLambdaInstance(1425358052, false, new ny() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda$1425358052$1
        public final void invoke(RowScope rowScope, Composer composer, int i) {
            if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1425358052, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$1425358052.<anonymous> (TimePicker.kt:1328)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_time_picker_am), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return w01.a;
        }
    });

    /* renamed from: lambda$-1179219109, reason: not valid java name */
    private static ny f97lambda$1179219109 = ComposableLambdaKt.composableLambdaInstance(-1179219109, false, new ny() { // from class: androidx.compose.material3.ComposableSingletons$TimePickerKt$lambda$-1179219109$1
        public final void invoke(RowScope rowScope, Composer composer, int i) {
            if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1179219109, i, -1, "androidx.compose.material3.ComposableSingletons$TimePickerKt.lambda$-1179219109.<anonymous> (TimePicker.kt:1346)");
            }
            Strings.Companion companion = Strings.Companion;
            TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(Strings.m2904constructorimpl(R.string.m3c_time_picker_pm), composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // defpackage.ny
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
            return w01.a;
        }
    });

    /* renamed from: getLambda$-1179219109$material3, reason: not valid java name */
    public final ny m1847getLambda$1179219109$material3() {
        return f97lambda$1179219109;
    }

    public final ny getLambda$1425358052$material3() {
        return lambda$1425358052;
    }
}

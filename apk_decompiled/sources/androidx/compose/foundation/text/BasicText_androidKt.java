package androidx.compose.foundation.text;

import android.os.Trace;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.ParagraphIntrinsicsKt;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.e1;
import defpackage.ut;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicText_androidKt {
    private static final ProvidableCompositionLocal<Executor> LocalBackgroundTextMeasurementExecutor = CompositionLocalKt.staticCompositionLocalOf(new e1(9));
    private static final int MaxTextLengthThreshold = 1000;
    private static final int MinTextLengthThreshold = 8;
    private static final int PrefetchTextMinimumCoreCount = 4;
    private static Boolean backingCoreCountSatisfactory;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004d, code lost:
    
        if (r13.changed(r10) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: RejectedExecutionException -> 0x00a2, TryCatch #0 {RejectedExecutionException -> 0x00a2, blocks: (B:37:0x0049, B:13:0x0056, B:15:0x006b, B:18:0x0076, B:20:0x0088, B:22:0x009d, B:32:0x0090, B:33:0x0071, B:10:0x004f), top: B:36:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackgroundTextMeasurement(final AnnotatedString annotatedString, final TextStyle textStyle, final FontFamily.Resolver resolver, final List<AnnotatedString.Range<Placeholder>> list, Composer composer, int i) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-650368117, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:102)");
        }
        Executor executor = (Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(annotatedString.length())) {
            composer.startReplaceGroup(-523310345);
        } else {
            composer.startReplaceGroup(-518761746);
            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            if (((i & 112) ^ 48) > 32) {
            }
            if ((i & 48) != 32) {
                z = false;
                changed = z | composer.changed(layoutDirection.ordinal()) | composer.changedInstance(list) | ((((i & 14) ^ 6) > 4 && composer.changed(annotatedString)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    Object obj = new Runnable() { // from class: sd
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasicText_androidKt.BackgroundTextMeasurement$lambda$1$0(TextStyle.this, layoutDirection, list, annotatedString, density, resolver);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                executor.execute((Runnable) rememberedValue);
            }
            z = true;
            if (((i & 14) ^ 6) > 4) {
                changed = z | composer.changed(layoutDirection.ordinal()) | composer.changedInstance(list) | ((((i & 14) ^ 6) > 4 && composer.changed(annotatedString)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                Object obj2 = new Runnable() { // from class: sd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasicText_androidKt.BackgroundTextMeasurement$lambda$1$0(TextStyle.this, layoutDirection, list, annotatedString, density, resolver);
                    }
                };
                composer.updateRememberedValue(obj2);
                rememberedValue = obj2;
                executor.execute((Runnable) rememberedValue);
            }
            changed = z | composer.changed(layoutDirection.ordinal()) | composer.changedInstance(list) | ((((i & 14) ^ 6) > 4 && composer.changed(annotatedString)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            Object obj22 = new Runnable() { // from class: sd
                @Override // java.lang.Runnable
                public final void run() {
                    BasicText_androidKt.BackgroundTextMeasurement$lambda$1$0(TextStyle.this, layoutDirection, list, annotatedString, density, resolver);
                }
            };
            composer.updateRememberedValue(obj22);
            rememberedValue = obj22;
            executor.execute((Runnable) rememberedValue);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackgroundTextMeasurement$lambda$0$0(TextStyle textStyle, LayoutDirection layoutDirection, String str, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.Companion, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    ParagraphIntrinsicsKt.ParagraphIntrinsics$default(str, TextStyleKt.resolveDefaults(textStyle, layoutDirection), ut.d, density, resolver, (List) null, 32, (Object) null).getMaxIntrinsicWidth();
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    takeMutableSnapshot$default.apply().check();
                    takeMutableSnapshot$default.dispose();
                } catch (Throwable th) {
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackgroundTextMeasurement$lambda$1$0(TextStyle textStyle, LayoutDirection layoutDirection, List list, AnnotatedString annotatedString, Density density, FontFamily.Resolver resolver) {
        Trace.beginSection("BackgroundTextMeasurement");
        try {
            MutableSnapshot takeMutableSnapshot$default = Snapshot.Companion.takeMutableSnapshot$default(Snapshot.Companion, null, null, 3, null);
            try {
                Snapshot makeCurrent = takeMutableSnapshot$default.makeCurrent();
                try {
                    TextStyle resolveDefaults = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                    if (list == null) {
                        list = ut.d;
                    }
                    new MultiParagraphIntrinsics(annotatedString, resolveDefaults, (List<AnnotatedString.Range<Placeholder>>) list, density, resolver).getMaxIntrinsicWidth();
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    takeMutableSnapshot$default.apply().check();
                    takeMutableSnapshot$default.dispose();
                } catch (Throwable th) {
                    takeMutableSnapshot$default.restoreCurrent(makeCurrent);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor LocalBackgroundTextMeasurementExecutor$lambda$0() {
        return null;
    }

    public static final boolean getCoreCountSatisfactory() {
        Boolean bool = backingCoreCountSatisfactory;
        if (bool == null) {
            bool = Boolean.valueOf(Runtime.getRuntime().availableProcessors() >= 4);
            backingCoreCountSatisfactory = bool;
        }
        bool.getClass();
        return bool.booleanValue();
    }

    public static final ProvidableCompositionLocal<Executor> getLocalBackgroundTextMeasurementExecutor() {
        return LocalBackgroundTextMeasurementExecutor;
    }

    public static final boolean shouldPrefetch(int i) {
        return i >= 8 && i < 1000 && getCoreCountSatisfactory();
    }

    public static /* synthetic */ void getCoreCountSatisfactory$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004d, code lost:
    
        if (r11.changed(r9) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[Catch: RejectedExecutionException -> 0x009c, TryCatch #0 {RejectedExecutionException -> 0x009c, blocks: (B:37:0x0049, B:13:0x0056, B:15:0x0066, B:18:0x0071, B:20:0x0083, B:22:0x0097, B:32:0x008b, B:33:0x006c, B:10:0x004f), top: B:36:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BackgroundTextMeasurement(final String str, final TextStyle textStyle, final FontFamily.Resolver resolver, Composer composer, int i) {
        boolean z;
        boolean changed;
        Object rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1589371739, i, -1, "androidx.compose.foundation.text.BackgroundTextMeasurement (BasicText.android.kt:68)");
        }
        Executor executor = (Executor) composer.consume(LocalBackgroundTextMeasurementExecutor);
        if (executor == null || !shouldPrefetch(str.length())) {
            composer.startReplaceGroup(1250991751);
        } else {
            composer.startReplaceGroup(1254274527);
            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            if (((i & 112) ^ 48) > 32) {
            }
            if ((i & 48) != 32) {
                z = false;
                changed = z | composer.changed(layoutDirection.ordinal()) | ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!changed || rememberedValue == Composer.Companion.getEmpty()) {
                    Object obj = new Runnable() { // from class: td
                        @Override // java.lang.Runnable
                        public final void run() {
                            BasicText_androidKt.BackgroundTextMeasurement$lambda$0$0(TextStyle.this, layoutDirection, str, density, resolver);
                        }
                    };
                    composer.updateRememberedValue(obj);
                    rememberedValue = obj;
                }
                executor.execute((Runnable) rememberedValue);
            }
            z = true;
            if (((i & 14) ^ 6) > 4) {
                changed = z | composer.changed(layoutDirection.ordinal()) | ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                Object obj2 = new Runnable() { // from class: td
                    @Override // java.lang.Runnable
                    public final void run() {
                        BasicText_androidKt.BackgroundTextMeasurement$lambda$0$0(TextStyle.this, layoutDirection, str, density, resolver);
                    }
                };
                composer.updateRememberedValue(obj2);
                rememberedValue = obj2;
                executor.execute((Runnable) rememberedValue);
            }
            changed = z | composer.changed(layoutDirection.ordinal()) | ((((i & 14) ^ 6) > 4 && composer.changed(str)) || (i & 6) == 4) | composer.changed(density) | composer.changedInstance(resolver);
            rememberedValue = composer.rememberedValue();
            if (!changed) {
            }
            Object obj22 = new Runnable() { // from class: td
                @Override // java.lang.Runnable
                public final void run() {
                    BasicText_androidKt.BackgroundTextMeasurement$lambda$0$0(TextStyle.this, layoutDirection, str, density, resolver);
                }
            };
            composer.updateRememberedValue(obj22);
            rememberedValue = obj22;
            executor.execute((Runnable) rememberedValue);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}

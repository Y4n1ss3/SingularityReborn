package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.TimePickerDialogDefaults;
import androidx.compose.material3.TimePickerDisplayMode;
import androidx.compose.material3.internal.Icons;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DialogTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import defpackage.iy;
import defpackage.my;
import defpackage.u6;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TimePickerDialogDefaults {
    public static final int $stable = 0;
    public static final TimePickerDialogDefaults INSTANCE = new TimePickerDialogDefaults();
    private static final float MinHeightForTimePicker = Dp.m7611constructorimpl(300.0f);

    private TimePickerDialogDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DisplayModeToggle_S7Bxtbk$lambda$0(TimePickerDialogDefaults timePickerDialogDefaults, iy iyVar, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        timePickerDialogDefaults.m2633DisplayModeToggleS7Bxtbk(iyVar, i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 Title_pK_nZyw$lambda$1(TimePickerDialogDefaults timePickerDialogDefaults, int i, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        timePickerDialogDefaults.m2634TitlepK_nZyw(i, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return w01.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* renamed from: DisplayModeToggle-S7Bxtbk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2633DisplayModeToggleS7Bxtbk(iy iyVar, final int i, Modifier modifier, Composer composer, int i2, int i3) {
        iy iyVar2;
        int i4;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1283607635);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            iyVar2 = iyVar;
        } else {
            iyVar2 = iyVar;
            if ((i2 & 6) == 0) {
                i4 = (startRestartGroup.changedInstance(iyVar2) ? 4 : 2) | i2;
            } else {
                i4 = i2;
            }
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? Fields.RotationX : Fields.SpotShadowColor;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1283607635, i4, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle (TimePickerDialog.kt:264)");
                }
                IconButtonKt.IconButton(iyVar2, modifier4, false, null, null, null, ComposableLambdaKt.rememberComposableLambda(-698026161, true, new my() { // from class: androidx.compose.material3.TimePickerDialogDefaults$DisplayModeToggle$1
                    public final void invoke(Composer composer2, int i6) {
                        int m2904constructorimpl;
                        if (!composer2.shouldExecute((i6 & 3) != 2, i6 & 1)) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-698026161, i6, -1, "androidx.compose.material3.TimePickerDialogDefaults.DisplayModeToggle.<anonymous> (TimePickerDialog.kt:266)");
                        }
                        int i7 = i;
                        TimePickerDisplayMode.Companion companion = TimePickerDisplayMode.Companion;
                        ImageVector keyboard = TimePickerDisplayMode.m2641equalsimpl0(i7, companion.m2646getPickerONbchU()) ? Icons.Outlined.INSTANCE.getKeyboard() : Icons.Outlined.INSTANCE.getSchedule();
                        if (TimePickerDisplayMode.m2641equalsimpl0(i, companion.m2646getPickerONbchU())) {
                            Strings.Companion companion2 = Strings.Companion;
                            m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_toggle_touch);
                        } else {
                            Strings.Companion companion3 = Strings.Companion;
                            m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_toggle_keyboard);
                        }
                        IconKt.m2055Iconww6aTOc(keyboard, Strings_androidKt.m2983getString2EP1pXo(m2904constructorimpl, composer2, 0), (Modifier) null, 0L, composer2, 0, 12);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // defpackage.my
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        invoke((Composer) obj, ((Number) obj2).intValue());
                        return w01.a;
                    }
                }, startRestartGroup, 54), startRestartGroup, (i4 & 14) | 1572864 | ((i4 >> 3) & 112), 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new u6(this, iyVar, i, modifier3, i2, i3));
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* renamed from: Title-pK_nZyw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2634TitlepK_nZyw(final int i, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        int m2904constructorimpl;
        Composer startRestartGroup = composer.startRestartGroup(1546564986);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = i2 | (startRestartGroup.changed(i) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1546564986, i4, -1, "androidx.compose.material3.TimePickerDialogDefaults.Title (TimePickerDialog.kt:294)");
                }
                Modifier m766paddingqDBjuR0$default = PaddingKt.m766paddingqDBjuR0$default(modifier4, 0.0f, 0.0f, 0.0f, Dp.m7611constructorimpl(20.0f), 7, null);
                Modifier modifier5 = modifier4;
                TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(startRestartGroup, 6).getLabelMedium();
                if (TimePickerDisplayMode.m2641equalsimpl0(i, TimePickerDisplayMode.Companion.m2646getPickerONbchU())) {
                    Strings.Companion companion = Strings.Companion;
                    m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_picker_dialog_title);
                } else {
                    Strings.Companion companion2 = Strings.Companion;
                    m2904constructorimpl = Strings.m2904constructorimpl(R.string.m3c_time_input_dialog_title);
                }
                composer2 = startRestartGroup;
                TextKt.m2607TextNvy7gAk(Strings_androidKt.m2983getString2EP1pXo(m2904constructorimpl, startRestartGroup, 0), m766paddingqDBjuR0$default, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new my() { // from class: bv0
                    @Override // defpackage.my
                    public final Object invoke(Object obj, Object obj2) {
                        w01 Title_pK_nZyw$lambda$1;
                        int intValue = ((Integer) obj2).intValue();
                        Title_pK_nZyw$lambda$1 = TimePickerDialogDefaults.Title_pK_nZyw$lambda$1(TimePickerDialogDefaults.this, i, modifier3, i2, i3, (Composer) obj, intValue);
                        return Title_pK_nZyw$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i4 & 19) == 18, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public final long getContainerColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-443775449, i, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-containerColor> (TimePickerDialog.kt:242)");
        }
        long value = ColorSchemeKt.getValue(DialogTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getMinHeightForTimePicker-D9Ej5fM, reason: not valid java name */
    public final float m2635getMinHeightForTimePickerD9Ej5fM() {
        return MinHeightForTimePicker;
    }

    public final Shape getShape(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1241096723, i, -1, "androidx.compose.material3.TimePickerDialogDefaults.<get-shape> (TimePickerDialog.kt:246)");
        }
        Shape value = ShapesKt.getValue(DialogTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }
}

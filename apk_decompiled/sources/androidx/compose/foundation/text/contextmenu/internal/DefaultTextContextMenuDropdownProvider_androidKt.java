package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.compose.foundation.contextmenu.ContextMenuPopupPositionProvider;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuSpec;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuItem;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSeparator;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuTextClassificationItem;
import androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import defpackage.dq;
import defpackage.f1;
import defpackage.i2;
import defpackage.iy;
import defpackage.ky;
import defpackage.my;
import defpackage.ny;
import defpackage.q6;
import defpackage.r4;
import defpackage.rc;
import defpackage.sq;
import defpackage.v4;
import defpackage.w01;
import defpackage.w5;
import defpackage.z5;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DefaultTextContextMenuDropdownProvider_androidKt {
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (dq) null);

    private static final void DefaultTextContextMenuDropdown(TextContextMenuSession textContextMenuSession, TextContextMenuData textContextMenuData, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(1904307118);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(textContextMenuSession) : startRestartGroup.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(textContextMenuData) ? 32 : 16;
        }
        boolean z = false;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1904307118, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:133)");
            }
            startRestartGroup.startReplaceGroup(-1009482584);
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            startRestartGroup.endReplaceGroup();
            boolean changedInstance = startRestartGroup.changedInstance(textContextMenuData);
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(textContextMenuSession))) {
                z = true;
            }
            boolean changedInstance2 = changedInstance | z | startRestartGroup.changedInstance(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new f1(textContextMenuData, context, textContextMenuSession, 7);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ContextMenuUiKt.ContextMenuColumnBuilder(null, null, (ky) rememberedValue, startRestartGroup, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new q6(textContextMenuSession, textContextMenuData, i, 19));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DefaultTextContextMenuDropdown$lambda$0$0(TextContextMenuData textContextMenuData, Context context, TextContextMenuSession textContextMenuSession, ContextMenuScope contextMenuScope) {
        ContextMenuScope contextMenuScope2;
        List<TextContextMenuComponent> components = textContextMenuData.getComponents();
        int size = components.size();
        int i = 0;
        while (i < size) {
            final TextContextMenuComponent textContextMenuComponent = components.get(i);
            if (textContextMenuComponent instanceof TextContextMenuItem) {
                TextContextMenuItem textContextMenuItem = (TextContextMenuItem) textContextMenuComponent;
                contextMenuScope2 = contextMenuScope;
                ContextMenuScope.item$default(contextMenuScope2, new w5(textContextMenuItem, 4), null, false, textContextMenuItem.getLeadingIcon() == 0 ? null : ComposableLambdaKt.composableLambdaInstance(-1930700965, true, new ny() { // from class: androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdownProvider_androidKt$DefaultTextContextMenuDropdown$1$1$1$2
                    @Override // defpackage.ny
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        m1212invokeek8zF_U(((Color) obj).m4771unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
                        return w01.a;
                    }

                    /* renamed from: invoke-ek8zF_U, reason: not valid java name */
                    public final void m1212invokeek8zF_U(long j, Composer composer, int i2) {
                        if ((i2 & 6) == 0) {
                            i2 |= composer.changed(j) ? 4 : 2;
                        }
                        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1930700965, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:150)");
                        }
                        DefaultTextContextMenuDropdownProvider_androidKt.m1210IconBoxRPmYEkk(((TextContextMenuItem) TextContextMenuComponent.this).getLeadingIcon(), j, composer, (i2 << 3) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), new v4(14, textContextMenuItem, textContextMenuSession), 6, null);
            } else {
                contextMenuScope2 = contextMenuScope;
                if (textContextMenuComponent instanceof TextContextMenuTextClassificationItem) {
                    TextContextMenuHelperApi28.INSTANCE.textClassificationItem(contextMenuScope2, context, (TextContextMenuTextClassificationItem) textContextMenuComponent);
                } else if (textContextMenuComponent instanceof TextContextMenuSeparator) {
                    contextMenuScope2.separator();
                }
            }
            i++;
            contextMenuScope = contextMenuScope2;
        }
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String DefaultTextContextMenuDropdown$lambda$0$0$0$0(TextContextMenuComponent textContextMenuComponent, Composer composer, int i) {
        composer.startReplaceGroup(666084174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(666084174, i, -1, "androidx.compose.foundation.text.contextmenu.internal.DefaultTextContextMenuDropdown.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:145)");
        }
        String label = ((TextContextMenuItem) textContextMenuComponent).getLabel();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DefaultTextContextMenuDropdown$lambda$0$0$0$1(TextContextMenuComponent textContextMenuComponent, TextContextMenuSession textContextMenuSession) {
        ((TextContextMenuItem) textContextMenuComponent).getOnClick().invoke(textContextMenuSession);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 DefaultTextContextMenuDropdown$lambda$1(TextContextMenuSession textContextMenuSession, TextContextMenuData textContextMenuData, int i, Composer composer, int i2) {
        DefaultTextContextMenuDropdown(textContextMenuSession, textContextMenuData, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IconBox-RPmYEkk, reason: not valid java name */
    public static final void m1210IconBoxRPmYEkk(final int i, final long j, Composer composer, final int i2) {
        final int i3;
        int i4;
        ScopeUpdateScope endRestartGroup;
        my myVar;
        Composer startRestartGroup = composer.startRestartGroup(-1240244237);
        if ((i2 & 6) == 0) {
            i3 = i;
            i4 = i2 | (startRestartGroup.changed(i3) ? 4 : 2);
        } else {
            i3 = i;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(j) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1240244237, i4, -1, "androidx.compose.foundation.text.contextmenu.internal.IconBox (DefaultTextContextMenuDropdownProvider.android.kt:166)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            boolean changed = ((i4 & 14) == 4) | startRestartGroup.changed(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = Integer.valueOf(context.obtainStyledAttributes(new int[]{i3}).getResourceId(0, -1));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            if (intValue == -1) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    myVar = new my() { // from class: tq
                        @Override // defpackage.my
                        public final Object invoke(Object obj, Object obj2) {
                            w01 IconBox_RPmYEkk$lambda$1;
                            w01 IconBox_RPmYEkk$lambda$3;
                            switch (i5) {
                                case 0:
                                    int intValue2 = ((Integer) obj2).intValue();
                                    IconBox_RPmYEkk$lambda$1 = DefaultTextContextMenuDropdownProvider_androidKt.IconBox_RPmYEkk$lambda$1(i3, j, i2, (Composer) obj, intValue2);
                                    return IconBox_RPmYEkk$lambda$1;
                                default:
                                    int intValue3 = ((Integer) obj2).intValue();
                                    IconBox_RPmYEkk$lambda$3 = DefaultTextContextMenuDropdownProvider_androidKt.IconBox_RPmYEkk$lambda$3(i3, j, i2, (Composer) obj, intValue3);
                                    return IconBox_RPmYEkk$lambda$3;
                            }
                        }
                    };
                    endRestartGroup.updateScope(myVar);
                }
                return;
            }
            Painter painterResource = PainterResources_androidKt.painterResource(intValue, startRestartGroup, 0);
            boolean z = (i4 & 112) == 32;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = j == 16 ? null : ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            BoxKt.Box(PainterModifierKt.paint$default(SizeKt.m807size3ABfNKs(Modifier.Companion, ContextMenuSpec.INSTANCE.m344getIconSizeD9Ej5fM()), painterResource, false, null, ContentScale.Companion.getFit(), 0.0f, (ColorFilter) rememberedValue2, 22, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final int i6 = 1;
            myVar = new my() { // from class: tq
                @Override // defpackage.my
                public final Object invoke(Object obj, Object obj2) {
                    w01 IconBox_RPmYEkk$lambda$1;
                    w01 IconBox_RPmYEkk$lambda$3;
                    switch (i6) {
                        case 0:
                            int intValue2 = ((Integer) obj2).intValue();
                            IconBox_RPmYEkk$lambda$1 = DefaultTextContextMenuDropdownProvider_androidKt.IconBox_RPmYEkk$lambda$1(i, j, i2, (Composer) obj, intValue2);
                            return IconBox_RPmYEkk$lambda$1;
                        default:
                            int intValue3 = ((Integer) obj2).intValue();
                            IconBox_RPmYEkk$lambda$3 = DefaultTextContextMenuDropdownProvider_androidKt.IconBox_RPmYEkk$lambda$3(i, j, i2, (Composer) obj, intValue3);
                            return IconBox_RPmYEkk$lambda$3;
                    }
                }
            };
            endRestartGroup.updateScope(myVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox_RPmYEkk$lambda$1(int i, long j, int i2, Composer composer, int i3) {
        m1210IconBoxRPmYEkk(i, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 IconBox_RPmYEkk$lambda$3(int i, long j, int i2, Composer composer, int i3) {
        m1210IconBoxRPmYEkk(i, j, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OpenContextMenu(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-2040393164);
        int i3 = 2;
        int i4 = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(textContextMenuSession) : startRestartGroup.changedInstance(textContextMenuSession) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(textContextMenuDataProvider) : startRestartGroup.changedInstance(textContextMenuDataProvider) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(iyVar) ? Fields.RotationX : Fields.SpotShadowColor;
        }
        boolean z = false;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2040393164, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu (DefaultTextContextMenuDropdownProvider.android.kt:109)");
            }
            Object[] objArr = (i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changed(textContextMenuDataProvider));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (objArr != false || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new MaintainWindowPositionPopupPositionProvider(new ContextMenuPopupPositionProvider((iy) new v4(15, textContextMenuDataProvider, iyVar), (my) null, i3, (dq) (0 == true ? 1 : 0)));
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MaintainWindowPositionPopupPositionProvider maintainWindowPositionPopupPositionProvider = (MaintainWindowPositionPopupPositionProvider) rememberedValue;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(textContextMenuSession))) {
                z = true;
            }
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new i2(textContextMenuSession, 12);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AndroidPopup_androidKt.Popup(maintainWindowPositionPopupPositionProvider, (iy) rememberedValue2, DefaultPopupProperties, ComposableLambdaKt.rememberComposableLambda(1315155414, true, new r4(i4, textContextMenuDataProvider, textContextMenuSession), startRestartGroup, 54), startRestartGroup, 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new z5(i, 8, textContextMenuSession, textContextMenuDataProvider, iyVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset OpenContextMenu$lambda$0$0(TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar) {
        return IntOffset.m7730boximpl(IntOffsetKt.m7756roundk4lQ0M(textContextMenuDataProvider.mo1224positiontuRUvjQ((LayoutCoordinates) iyVar.invoke())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OpenContextMenu$lambda$1$0(TextContextMenuSession textContextMenuSession) {
        textContextMenuSession.close();
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OpenContextMenu$lambda$2(TextContextMenuDataProvider textContextMenuDataProvider, TextContextMenuSession textContextMenuSession, Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315155414, i, -1, "androidx.compose.foundation.text.contextmenu.internal.OpenContextMenu.<anonymous> (DefaultTextContextMenuDropdownProvider.android.kt:124)");
            }
            boolean changed = composer.changed(textContextMenuDataProvider);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = SnapshotStateKt.derivedStateOf(new DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(textContextMenuDataProvider));
                composer.updateRememberedValue(rememberedValue);
            }
            DefaultTextContextMenuDropdown(textContextMenuSession, OpenContextMenu$lambda$2$1((State) rememberedValue), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }

    private static final TextContextMenuData OpenContextMenu$lambda$2$1(State<TextContextMenuData> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 OpenContextMenu$lambda$3(TextContextMenuSession textContextMenuSession, TextContextMenuDataProvider textContextMenuDataProvider, iy iyVar, int i, Composer composer, int i2) {
        OpenContextMenu(textContextMenuSession, textContextMenuDataProvider, iyVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final void ProvideDefaultTextContextMenuDropdown(Modifier modifier, my myVar, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        my myVar2;
        Composer startRestartGroup = composer.startRestartGroup(1392105195);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(myVar) ? 32 : 16;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1392105195, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:85)");
            }
            modifier2 = modifier;
            myVar2 = myVar;
            BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu(modifier2, TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider(), ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.getLambda$636288403$foundation(), myVar2, startRestartGroup, (i2 & 14) | 432 | ((i2 << 6) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier2 = modifier;
            myVar2 = myVar;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new sq(modifier2, myVar2, i, i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideDefaultTextContextMenuDropdown$lambda$0(my myVar, int i, Composer composer, int i2) {
        ProvideDefaultTextContextMenuDropdown(myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 ProvideDefaultTextContextMenuDropdown$lambda$1(Modifier modifier, my myVar, int i, Composer composer, int i2) {
        ProvideDefaultTextContextMenuDropdown(modifier, myVar, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return w01.a;
    }

    public static final BasicTextContextMenuProvider defaultTextContextMenuDropdown(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1197778906, i, -1, "androidx.compose.foundation.text.contextmenu.internal.defaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:98)");
        }
        BasicTextContextMenuProvider basicTextContextMenuProvider = BasicTextContextMenuProviderKt.basicTextContextMenuProvider(ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.m1209getLambda$1357803046$foundation(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return basicTextContextMenuProvider;
    }

    public static final void ProvideDefaultTextContextMenuDropdown(my myVar, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(422095256);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(myVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422095256, i2, -1, "androidx.compose.foundation.text.contextmenu.internal.ProvideDefaultTextContextMenuDropdown (DefaultTextContextMenuDropdownProvider.android.kt:71)");
            }
            BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu(TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider(), ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.INSTANCE.getLambda$129995601$foundation(), myVar, startRestartGroup, ((i2 << 6) & 896) | 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new rc(i, i3, myVar));
        }
    }
}

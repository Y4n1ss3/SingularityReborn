package defpackage;

import android.content.pm.PackageManager;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.lazy.grid.LazyGridMeasureKt;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItem;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider;
import androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt;
import androidx.compose.foundation.text.BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.ContentResolverForSecureTextField;
import androidx.compose.foundation.text.CoreTextFieldKt;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.DatePickerColors;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DateRangePickerDefaults;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.ExposedDropdownMenu_androidKt;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SelectedRangeInfo;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.composer.linkbuffer.changelist.Operations;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.TextFieldValue;
import com.lumi.singularity.ui.activities.MainActivity;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 handlePressInteractionCancel$lambda$0$0$0;
        w01 requestOnAfterLayoutCallback$lambda$0;
        DisposableEffectResult platformAllowsRevealLastTyped$lambda$5$0;
        w01 BasicTextField$lambda$27$0;
        w01 keyboardBehavior$lambda$13;
        w01 drawRoundRectBorder_JqoCqck$lambda$1;
        w01 drawGenericBorder$lambda$0;
        w01 StandardBottomSheet_w7I5h1o$lambda$10$lambda$9;
        w01 enqueue$lambda$1;
        w01 ContextMenuArea$lambda$1$0;
        w01 CoreTextField$lambda$24$0;
        boolean applySemantics$lambda$4;
        w01 Month$lambda$51$lambda$50;
        w01 DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2;
        w01 ModalWideNavigationRail$lambda$20$lambda$19;
        CharSequence generateBatchErrorMessage$lambda$0$0;
        DisposableEffectResult SoftKeyboardListener$lambda$5$lambda$4;
        w01 emitWithFallback$lambda$0;
        TypefaceResult resolve$lambda$0;
        w01 drawWithCacheModifierNode$lambda$3$lambda$2;
        DisposableEffectResult animateValue$lambda$2$0;
        LazyGridMeasuredItem measureLazyGrid_t1x4au0$lambda$7;
        LazySaveableStateHolder saver$lambda$1;
        w01 ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22;
        CharSequence collectionString$lambda$0;
        CharSequence collectionString$lambda$02;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                handlePressInteractionCancel$lambda$0$0$0 = AbstractClickableNode.handlePressInteractionCancel$lambda$0$0$0((MutableInteractionSource) obj3, (PressInteraction.Cancel) obj2, (Throwable) obj);
                return handlePressInteractionCancel$lambda$0$0$0;
            case 1:
                PackageManager packageManager = (PackageManager) obj3;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj2;
                String str = (String) obj;
                str.getClass();
                packageManager.getClass();
                String n = kb.n(str, packageManager);
                String d = n != null ? uo.d("Installed (v", n, ")") : "Ready";
                e8 e8Var = (e8) snapshotStateMap.get(str);
                snapshotStateMap.put(str, e8Var != null ? e8.a(e8Var, d, false, n, false, null, 16) : new e8(24, d, n));
                return w01Var;
            case 2:
                SnapshotStateMap snapshotStateMap2 = (SnapshotStateMap) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                Object obj4 = snapshotStateMap2.get(str2);
                obj4.getClass();
                snapshotStateMap2.put(str2, e8.a((e8) obj4, str3, true, null, false, null, 28));
                return w01Var;
            case 3:
                requestOnAfterLayoutCallback$lambda$0 = AwaitFirstLayoutModifier.Node.requestOnAfterLayoutCallback$lambda$0((AwaitFirstLayoutModifier.Node) obj3, (AwaitFirstLayoutModifier) obj2, (RelativeLayoutBounds) obj);
                return requestOnAfterLayoutCallback$lambda$0;
            case 4:
                platformAllowsRevealLastTyped$lambda$5$0 = BasicSecureTextField_androidKt.platformAllowsRevealLastTyped$lambda$5$0((ContentResolverForSecureTextField) obj3, (BasicSecureTextField_androidKt$platformAllowsRevealLastTyped$settingsObserver$1$1) obj2, (DisposableEffectScope) obj);
                return platformAllowsRevealLastTyped$lambda$5$0;
            case 5:
                BasicTextField$lambda$27$0 = BasicTextFieldKt.BasicTextField$lambda$27$0((TextFieldValue) obj3, (ky) obj2, (TextFieldValue) obj);
                return BasicTextField$lambda$27$0;
            case 6:
                keyboardBehavior$lambda$13 = BasicTooltipKt.keyboardBehavior$lambda$13((un) obj3, (TooltipState) obj2, (FocusState) obj);
                return keyboardBehavior$lambda$13;
            case 7:
                drawRoundRectBorder_JqoCqck$lambda$1 = BorderModifierNode.drawRoundRectBorder_JqoCqck$lambda$1((Path) obj3, (Brush) obj2, (ContentDrawScope) obj);
                return drawRoundRectBorder_JqoCqck$lambda$1;
            case 8:
                drawGenericBorder$lambda$0 = BorderModifierNode.drawGenericBorder$lambda$0((Outline.Generic) obj3, (Brush) obj2, (ContentDrawScope) obj);
                return drawGenericBorder$lambda$0;
            case 9:
                StandardBottomSheet_w7I5h1o$lambda$10$lambda$9 = BottomSheetScaffoldKt.StandardBottomSheet_w7I5h1o$lambda$10$lambda$9((un) obj3, (SheetState) obj2, ((Float) obj).floatValue());
                return StandardBottomSheet_w7I5h1o$lambda$10$lambda$9;
            case 10:
                enqueue$lambda$1 = BringIntoViewRequestPriorityQueue.enqueue$lambda$1((BringIntoViewRequestPriorityQueue) obj3, (ContentInViewNode.Request) obj2, (Throwable) obj);
                return enqueue$lambda$1;
            case 11:
                ContextMenuArea$lambda$1$0 = ContextMenuAreaKt.ContextMenuArea$lambda$1$0((iy) obj3, (ContextMenuState) obj2, (Offset) obj);
                return ContextMenuArea$lambda$1$0;
            case Matrix.TranslateX /* 12 */:
                CoreTextField$lambda$24$0 = CoreTextFieldKt.CoreTextField$lambda$24$0((LegacyTextFieldState) obj3, (Brush) obj2, (ContentDrawScope) obj);
                return CoreTextField$lambda$24$0;
            case Matrix.TranslateY /* 13 */:
                applySemantics$lambda$4 = CoreTextFieldSemanticsModifierNode.applySemantics$lambda$4((CoreTextFieldSemanticsModifierNode) obj3, (SemanticsPropertyReceiver) obj2, (AnnotatedString) obj);
                return Boolean.valueOf(applySemantics$lambda$4);
            case Matrix.TranslateZ /* 14 */:
                Month$lambda$51$lambda$50 = DatePickerKt.Month$lambda$51$lambda$50((SelectedRangeInfo) obj3, (DatePickerColors) obj2, (ContentDrawScope) obj);
                return Month$lambda$51$lambda$50;
            case 15:
                DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2 = DateRangePickerDefaults.DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2((String) obj3, (String) obj2, (SemanticsPropertyReceiver) obj);
                return DateRangePickerHeadline_nZrIstQ$lambda$3$lambda$2;
            case 16:
                ModalWideNavigationRail$lambda$20$lambda$19 = DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$20$lambda$19((un) obj3, (Animatable) obj2, ((Float) obj).floatValue());
                return ModalWideNavigationRail$lambda$20$lambda$19;
            case 17:
                generateBatchErrorMessage$lambda$0$0 = EditProcessor.generateBatchErrorMessage$lambda$0$0((EditCommand) obj3, (EditProcessor) obj2, (EditCommand) obj);
                return generateBatchErrorMessage$lambda$0$0;
            case 18:
                SoftKeyboardListener$lambda$5$lambda$4 = ExposedDropdownMenu_androidKt.SoftKeyboardListener$lambda$5$lambda$4((View) obj3, (iy) obj2, (DisposableEffectScope) obj);
                return SoftKeyboardListener$lambda$5$lambda$4;
            case 19:
                emitWithFallback$lambda$0 = FocusableNode.emitWithFallback$lambda$0((MutableInteractionSource) obj3, (Interaction) obj2, (Throwable) obj);
                return emitWithFallback$lambda$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                resolve$lambda$0 = FontFamilyResolverImpl.resolve$lambda$0((FontFamilyResolverImpl) obj3, (TypefaceRequest) obj2, (ky) obj);
                return resolve$lambda$0;
            case 21:
                ((rz) obj3).d.removeCallbacks((z3) obj2);
                return w01Var;
            case 22:
                drawWithCacheModifierNode$lambda$3$lambda$2 = IndicatorLineNode.drawWithCacheModifierNode$lambda$3$lambda$2((Path) obj3, (IndicatorLineNode) obj2, (ContentDrawScope) obj);
                return drawWithCacheModifierNode$lambda$3$lambda$2;
            case 23:
                animateValue$lambda$2$0 = InfiniteTransitionKt.animateValue$lambda$2$0((InfiniteTransition) obj3, (InfiniteTransition.TransitionAnimationState) obj2, (DisposableEffectScope) obj);
                return animateValue$lambda$2$0;
            case 24:
                measureLazyGrid_t1x4au0$lambda$7 = LazyGridMeasureKt.measureLazyGrid_t1x4au0$lambda$7((LazyGridMeasuredLineProvider) obj3, (LazyGridMeasuredItemProvider) obj2, ((Integer) obj).intValue());
                return measureLazyGrid_t1x4au0$lambda$7;
            case RectListKt.BitOffsetForParentId /* 25 */:
                saver$lambda$1 = LazySaveableStateHolder.Companion.saver$lambda$1((SaveableStateRegistry) obj3, (SaveableStateHolder) obj2, (Map) obj);
                return saver$lambda$1;
            case 26:
                MainActivity.k((MainActivity) obj3, (ky) obj2, (String) obj);
                return w01Var;
            case 27:
                ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22 = ModalBottomSheetKt.ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22((SheetState) obj3, (Animatable) obj2, (GraphicsLayerScope) obj);
                return ModalBottomSheetContent_7___e2Q$lambda$23$lambda$22;
            case 28:
                collectionString$lambda$0 = Operations.toCollectionString$lambda$0((Operations) obj3, (String) obj2, obj);
                return collectionString$lambda$0;
            default:
                collectionString$lambda$02 = androidx.compose.runtime.composer.gapbuffer.changelist.Operations.toCollectionString$lambda$0((androidx.compose.runtime.composer.gapbuffer.changelist.Operations) obj3, (String) obj2, obj);
                return collectionString$lambda$02;
        }
    }
}

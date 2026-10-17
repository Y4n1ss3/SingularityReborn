package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.gestures.UpdatableAnimationState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.TextFieldPressGestureFilterKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.material3.AnalogTimePickerState;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.serialization.SerializableSaverKt;
import androidx.compose.runtime.snapshots.SnapshotStateList$Companion$CREATOR$1;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.TypefaceRequest;
import androidx.compose.ui.text.font.TypefaceRequestCache;
import androidx.compose.ui.text.font.TypefaceResult;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class te0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ te0(MutableState mutableState, String str) {
        this.d = 25;
        this.f = str;
        this.e = mutableState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 measurePager_7L1iB3k$lambda$18;
        w01 RadioButton$lambda$1$lambda$0;
        w01 effectJob$lambda$0$0$0$0;
        w01 writeObserverOf$lambda$0;
        w01 InputField$lambda$42$lambda$41;
        SearchBarState Saver$lambda$1;
        w01 SelectionContainer$lambda$7$0;
        w01 _set_onSelectionChange_$lambda$0;
        w01 contextMenuBuilder$lambda$0;
        w01 addSelectionContainerTextContextMenuComponents$lambda$0$1;
        Object serializableSaver$lambda$1;
        Object createFromParcel$lambda$0;
        w01 animate$lambda$1;
        w01 textFieldBackground$lambda$24$lambda$23;
        DrawResult textFieldBackground$lambda$24;
        DisposableEffectResult tapPressTextFieldModifier$lambda$0$1$0;
        w01 clipLink$lambda$0;
        w01 drawSelector$lambda$61;
        DrawResult drawCaret$lambda$0;
        DisposableEffectResult animateTo$lambda$2$0;
        DisposableEffectResult createChildTransitionInternal$lambda$1$0;
        DisposableEffectResult createDeferredAnimation$lambda$1$0;
        DisposableEffectResult createTransitionAnimation$lambda$1$0;
        w01 runCached$lambda$1;
        w01 animateToZero$lambda$2;
        w01 Scrim_3J_VO9M$lambda$33$lambda$32;
        DisposableEffectResult current$lambda$0$0;
        int i = this.d;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                measurePager_7L1iB3k$lambda$18 = PagerMeasureKt.measurePager_7L1iB3k$lambda$18((MutableState) obj3, (List) obj2, (Placeable.PlacementScope) obj);
                return measurePager_7L1iB3k$lambda$18;
            case 1:
                RadioButton$lambda$1$lambda$0 = RadioButtonKt.RadioButton$lambda$1$lambda$0((State) obj3, (State) obj2, (DrawScope) obj);
                return RadioButton$lambda$1$lambda$0;
            case 2:
                effectJob$lambda$0$0$0$0 = Recomposer.effectJob$lambda$0$0$0$0((Recomposer) obj3, (Throwable) obj2, (Throwable) obj);
                return effectJob$lambda$0$0$0$0;
            case 3:
                writeObserverOf$lambda$0 = Recomposer.writeObserverOf$lambda$0((ControlledComposition) obj3, (gb0) obj2, obj);
                return writeObserverOf$lambda$0;
            case 4:
                InputField$lambda$42$lambda$41 = SearchBarDefaults.InputField$lambda$42$lambda$41((ky) obj3, (String) obj2, (KeyboardActionScope) obj);
                return InputField$lambda$42$lambda$41;
            case 5:
                Saver$lambda$1 = SearchBarState.Companion.Saver$lambda$1((AnimationSpec) obj3, (AnimationSpec) obj2, (List) obj);
                return Saver$lambda$1;
            case 6:
                SelectionContainer$lambda$7$0 = SelectionContainerKt.SelectionContainer$lambda$7$0((un) obj3, (Clipboard) obj2, (AnnotatedString) obj);
                return SelectionContainer$lambda$7$0;
            case 7:
                _set_onSelectionChange_$lambda$0 = SelectionManager._set_onSelectionChange_$lambda$0((SelectionManager) obj3, (ky) obj2, (Selection) obj);
                return _set_onSelectionChange_$lambda$0;
            case 8:
                contextMenuBuilder$lambda$0 = SelectionManagerKt.contextMenuBuilder$lambda$0((SelectionManager) obj3, (ContextMenuState) obj2, (ContextMenuScope) obj);
                return contextMenuBuilder$lambda$0;
            case 9:
                addSelectionContainerTextContextMenuComponents$lambda$0$1 = SelectionManager_androidKt.addSelectionContainerTextContextMenuComponents$lambda$0$1((SelectionManager) obj3, (Context) obj2, (TextContextMenuBuilderScope) obj);
                return addSelectionContainerTextContextMenuComponents$lambda$0$1;
            case 10:
                serializableSaver$lambda$1 = SerializableSaverKt.serializableSaver$lambda$1((a30) obj3, (rk0) obj2, (Bundle) obj);
                return serializableSaver$lambda$1;
            case 11:
                createFromParcel$lambda$0 = SnapshotStateList$Companion$CREATOR$1.createFromParcel$lambda$0((Parcel) obj3, (ClassLoader) obj2, ((Integer) obj).intValue());
                return createFromParcel$lambda$0;
            case Matrix.TranslateX /* 12 */:
                animate$lambda$1 = SuspendAnimationKt.animate$lambda$1((my) obj3, (TwoWayConverter) obj2, (AnimationScope) obj);
                return animate$lambda$1;
            case Matrix.TranslateY /* 13 */:
                textFieldBackground$lambda$24$lambda$23 = TextFieldImplKt.textFieldBackground$lambda$24$lambda$23((Outline) obj3, (ColorProducer) obj2, (DrawScope) obj);
                return textFieldBackground$lambda$24$lambda$23;
            case Matrix.TranslateZ /* 14 */:
                textFieldBackground$lambda$24 = TextFieldImplKt.textFieldBackground$lambda$24((Shape) obj3, (ColorProducer) obj2, (CacheDrawScope) obj);
                return textFieldBackground$lambda$24;
            case 15:
                tapPressTextFieldModifier$lambda$0$1$0 = TextFieldPressGestureFilterKt.tapPressTextFieldModifier$lambda$0$1$0((MutableState) obj3, (MutableInteractionSource) obj2, (DisposableEffectScope) obj);
                return tapPressTextFieldModifier$lambda$0$1$0;
            case 16:
                clipLink$lambda$0 = TextLinkScope.clipLink$lambda$0((TextLinkScope) obj3, (AnnotatedString.Range) obj2, (GraphicsLayerScope) obj);
                return clipLink$lambda$0;
            case 17:
                drawSelector$lambda$61 = TimePickerKt.drawSelector$lambda$61((AnalogTimePickerState) obj3, (TimePickerColors) obj2, (ContentDrawScope) obj);
                return drawSelector$lambda$61;
            case 18:
                drawCaret$lambda$0 = TooltipScopeImpl.drawCaret$lambda$0((my) obj3, (TooltipScopeImpl) obj2, (CacheDrawScope) obj);
                return drawCaret$lambda$0;
            case 19:
                animateTo$lambda$2$0 = Transition.animateTo$lambda$2$0((un) obj3, (Transition) obj2, (DisposableEffectScope) obj);
                return animateTo$lambda$2$0;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                createChildTransitionInternal$lambda$1$0 = TransitionKt.createChildTransitionInternal$lambda$1$0((Transition) obj3, (Transition) obj2, (DisposableEffectScope) obj);
                return createChildTransitionInternal$lambda$1$0;
            case 21:
                createDeferredAnimation$lambda$1$0 = TransitionKt.createDeferredAnimation$lambda$1$0((Transition) obj3, (Transition.DeferredAnimation) obj2, (DisposableEffectScope) obj);
                return createDeferredAnimation$lambda$1$0;
            case 22:
                createTransitionAnimation$lambda$1$0 = TransitionKt.createTransitionAnimation$lambda$1$0((Transition) obj3, (Transition.TransitionAnimationState) obj2, (DisposableEffectScope) obj);
                return createTransitionAnimation$lambda$1$0;
            case 23:
                runCached$lambda$1 = TypefaceRequestCache.runCached$lambda$1((TypefaceRequestCache) obj3, (TypefaceRequest) obj2, (TypefaceResult) obj);
                return runCached$lambda$1;
            case 24:
                animateToZero$lambda$2 = UpdatableAnimationState.animateToZero$lambda$2((UpdatableAnimationState) obj3, (ky) obj2, ((Long) obj).longValue());
                return animateToZero$lambda$2;
            case RectListKt.BitOffsetForParentId /* 25 */:
                Scrim_3J_VO9M$lambda$33$lambda$32 = WideNavigationRailKt.Scrim_3J_VO9M$lambda$33$lambda$32((String) obj2, (MutableState) obj3, (SemanticsPropertyReceiver) obj);
                return Scrim_3J_VO9M$lambda$33$lambda$32;
            default:
                current$lambda$0$0 = WindowInsetsHolder.Companion.current$lambda$0$0((WindowInsetsHolder) obj3, (View) obj2, (DisposableEffectScope) obj);
                return current$lambda$0$0;
        }
    }

    public /* synthetic */ te0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }
}

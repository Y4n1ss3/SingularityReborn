package defpackage;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.foundation.BorderModifierNode;
import androidx.compose.foundation.contextmenu.ContextMenuGesturesKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.draganddrop.CacheDrawScopeDragShadowCallback;
import androidx.compose.foundation.gestures.DragGestureNode;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.lazy.LazyListMeasureKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListMeasuredItemProvider;
import androidx.compose.foundation.lazy.LazyListPrefetchStrategy;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridPrefetchStrategy;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridIntervalContent;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.BottomAppBarScrollBehavior;
import androidx.compose.material3.BottomAppBarState;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DefaultSingleRowTopAppBarOverride;
import androidx.compose.material3.DefaultTwoRowsTopAppBarOverride;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.IndicatorLineNode;
import androidx.compose.material3.SingleRowTopAppBarOverrideScope;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.TwoRowsTopAppBarOverrideScope;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.material3.internal.ChildSemanticsNode;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.HostDefaultKey;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 CursorHandle_USBMPiE$lambda$0$0;
        w01 BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18;
        w01 w01Var;
        DisposableEffectResult basicTextContextMenuProvider$lambda$1$0;
        DisposableEffectResult BasicTextField$lambda$12$0;
        DisposableEffectResult BasicTooltipBox$lambda$4$lambda$3;
        DisposableEffectResult BasicTooltipBox$lambda$1$0;
        DrawResult drawWithCacheModifierNode$lambda$0;
        w01 cachePicture$lambda$0$1;
        boolean applySemantics$lambda$1;
        Object compositionLocalWithHostDefaultOf$lambda$0;
        w01 contextMenuGestures$lambda$0;
        w01 WeekDays$lambda$48$lambda$47$lambda$45$lambda$44;
        w01 SingleRowTopAppBar$lambda$4$lambda$3;
        w01 TwoRowsTopAppBar$lambda$15$lambda$14;
        boolean _canDrag$lambda$0;
        w01 placeHelper_BmaY500$lambda$2;
        DrawResult Icon$lambda$12$lambda$11;
        w01 Icon$lambda$12$lambda$11$lambda$10;
        DrawResult drawWithCacheModifierNode$lambda$3;
        float scrollableState$lambda$0;
        LazyGridState saver$lambda$1;
        LazyListMeasuredItem measureLazyList__s_dbAc$lambda$7;
        float scrollableState$lambda$02;
        LazyListState saver$lambda$12;
        StaggeredGridItemSpan item$lambda$2$0;
        float scrollableState$lambda$03;
        int i = this.d;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return obj == ((i) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                v vVar = (v) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == vVar ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != vVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                CursorHandle_USBMPiE$lambda$0$0 = AndroidCursorHandle_androidKt.CursorHandle_USBMPiE$lambda$0$0((OffsetProvider) obj2, (SemanticsPropertyReceiver) obj);
                return CursorHandle_USBMPiE$lambda$0$0;
            case 3:
                BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18 = AppBarKt.BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18((BottomAppBarScrollBehavior) obj2, ((Float) obj).floatValue());
                return BottomAppBarLayout_t5fmz9U$lambda$19$lambda$18;
            case 4:
                w01Var = AppBarKt.settleAppBarBottom$lambda$30((BottomAppBarState) obj2, (AnimationScope) obj);
                return w01Var;
            case 5:
                basicTextContextMenuProvider$lambda$1$0 = BasicTextContextMenuProviderKt.basicTextContextMenuProvider$lambda$1$0((BasicTextContextMenuProvider) obj2, (DisposableEffectScope) obj);
                return basicTextContextMenuProvider$lambda$1$0;
            case 6:
                BasicTextField$lambda$12$0 = BasicTextFieldKt.BasicTextField$lambda$12$0((TextFieldSelectionState) obj2, (DisposableEffectScope) obj);
                return BasicTextField$lambda$12$0;
            case 7:
                BasicTooltipBox$lambda$4$lambda$3 = BasicTooltipKt.BasicTooltipBox$lambda$4$lambda$3((TooltipState) obj2, (DisposableEffectScope) obj);
                return BasicTooltipBox$lambda$4$lambda$3;
            case 8:
                BasicTooltipBox$lambda$1$0 = androidx.compose.foundation.BasicTooltipKt.BasicTooltipBox$lambda$1$0((BasicTooltipState) obj2, (DisposableEffectScope) obj);
                return BasicTooltipBox$lambda$1$0;
            case 9:
                drawWithCacheModifierNode$lambda$0 = BorderModifierNode.drawWithCacheModifierNode$lambda$0((BorderModifierNode) obj2, (CacheDrawScope) obj);
                return drawWithCacheModifierNode$lambda$0;
            case 10:
                cachePicture$lambda$0$1 = CacheDrawScopeDragShadowCallback.cachePicture$lambda$0$1((CacheDrawScopeDragShadowCallback) obj2, (ContentDrawScope) obj);
                return cachePicture$lambda$0$1;
            case 11:
                applySemantics$lambda$1 = ChildSemanticsNode.applySemantics$lambda$1((SemanticsPropertyReceiver) obj2, (TraversableNode) obj);
                return Boolean.valueOf(applySemantics$lambda$1);
            case Matrix.TranslateX /* 12 */:
                compositionLocalWithHostDefaultOf$lambda$0 = CompositionLocalKt.compositionLocalWithHostDefaultOf$lambda$0((HostDefaultKey) obj2, (CompositionLocalAccessorScope) obj);
                return compositionLocalWithHostDefaultOf$lambda$0;
            case Matrix.TranslateY /* 13 */:
                contextMenuGestures$lambda$0 = ContextMenuGesturesKt.contextMenuGestures$lambda$0((ContextMenuState) obj2, (Offset) obj);
                return contextMenuGestures$lambda$0;
            case Matrix.TranslateZ /* 14 */:
                WeekDays$lambda$48$lambda$47$lambda$45$lambda$44 = DatePickerKt.WeekDays$lambda$48$lambda$47$lambda$45$lambda$44((xe0) obj2, (SemanticsPropertyReceiver) obj);
                return WeekDays$lambda$48$lambda$47$lambda$45$lambda$44;
            case 15:
                SingleRowTopAppBar$lambda$4$lambda$3 = DefaultSingleRowTopAppBarOverride.SingleRowTopAppBar$lambda$4$lambda$3((SingleRowTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
                return SingleRowTopAppBar$lambda$4$lambda$3;
            case 16:
                TwoRowsTopAppBar$lambda$15$lambda$14 = DefaultTwoRowsTopAppBarOverride.TwoRowsTopAppBar$lambda$15$lambda$14((TwoRowsTopAppBarOverrideScope) obj2, ((Float) obj).floatValue());
                return TwoRowsTopAppBar$lambda$15$lambda$14;
            case 17:
                _canDrag$lambda$0 = DragGestureNode._canDrag$lambda$0((DragGestureNode) obj2, (PointerType) obj);
                return Boolean.valueOf(_canDrag$lambda$0);
            case 18:
                placeHelper_BmaY500$lambda$2 = FlowLayoutKt.placeHelper_BmaY500$lambda$2((MutableVector) obj2, (Placeable.PlacementScope) obj);
                return placeHelper_BmaY500$lambda$2;
            case 19:
                Icon$lambda$12$lambda$11 = IconKt.Icon$lambda$12$lambda$11((ColorProducer) obj2, (CacheDrawScope) obj);
                return Icon$lambda$12$lambda$11;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Icon$lambda$12$lambda$11$lambda$10 = IconKt.Icon$lambda$12$lambda$11$lambda$10((GraphicsLayer) obj2, (ContentDrawScope) obj);
                return Icon$lambda$12$lambda$11$lambda$10;
            case 21:
                drawWithCacheModifierNode$lambda$3 = IndicatorLineNode.drawWithCacheModifierNode$lambda$3((IndicatorLineNode) obj2, (CacheDrawScope) obj);
                return drawWithCacheModifierNode$lambda$3;
            case 22:
                scrollableState$lambda$0 = LazyGridState.scrollableState$lambda$0((LazyGridState) obj2, ((Float) obj).floatValue());
                return Float.valueOf(scrollableState$lambda$0);
            case 23:
                saver$lambda$1 = LazyGridState.Companion.saver$lambda$1((LazyGridPrefetchStrategy) obj2, (List) obj);
                return saver$lambda$1;
            case 24:
                measureLazyList__s_dbAc$lambda$7 = LazyListMeasureKt.measureLazyList__s_dbAc$lambda$7((LazyListMeasuredItemProvider) obj2, ((Integer) obj).intValue());
                return measureLazyList__s_dbAc$lambda$7;
            case RectListKt.BitOffsetForParentId /* 25 */:
                scrollableState$lambda$02 = LazyListState.scrollableState$lambda$0((LazyListState) obj2, ((Float) obj).floatValue());
                return Float.valueOf(scrollableState$lambda$02);
            case 26:
                saver$lambda$12 = LazyListState.Companion.saver$lambda$1((LazyListPrefetchStrategy) obj2, (List) obj);
                return saver$lambda$12;
            case 27:
                item$lambda$2$0 = LazyStaggeredGridIntervalContent.item$lambda$2$0((StaggeredGridItemSpan) obj2, ((Integer) obj).intValue());
                return item$lambda$2$0;
            case 28:
                scrollableState$lambda$03 = LazyStaggeredGridState.scrollableState$lambda$0((LazyStaggeredGridState) obj2, ((Float) obj).floatValue());
                return Float.valueOf(scrollableState$lambda$03);
            default:
                return ((t80) obj2).a(((Integer) obj).intValue());
        }
    }
}

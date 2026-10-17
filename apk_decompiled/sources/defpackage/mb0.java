package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.gestures.ScrollableNode;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.text.SecureTextFieldController;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuModifierKt;
import androidx.compose.foundation.text.input.internal.RecordingInputConnection;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.SearchBarKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.pulltorefresh.PullToRefreshKt;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.SnapshotMutableDoubleStateImpl;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.RectListKt;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class mb0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mb0(ob0 ob0Var, nb0 nb0Var) {
        this.d = 0;
        this.e = ob0Var;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        IntOffset ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18;
        w01 padding$lambda$0;
        w01 measurePager_7L1iB3k$lambda$18$0;
        w01 CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9;
        w01 _init_$lambda$0;
        w01 readObserverOf$lambda$0;
        w01 effectJob$lambda$0$0;
        w01 performHandwritingGesture$lambda$0;
        MutableState mutableStateSaver$lambda$0$1;
        w01 fitOutside$lambda$0$1;
        float scrollableState$lambda$0;
        w01 _init_$lambda$02;
        Offset performScrollForOverscroll$lambda$0;
        w01 SearchBar_nbWgWpA$lambda$1$lambda$0;
        w01 focusChangeModifier$lambda$0;
        w01 mouseSelection$lambda$0;
        Integer extractNestedStates$lambda$1;
        w01 component2$lambda$0;
        w01 component2$lambda$02;
        w01 component2$lambda$03;
        w01 component2$lambda$04;
        w01 component2$lambda$05;
        w01 readObserver$lambda$0;
        w01 collectTextContextMenuData$lambda$0$0;
        int i = this.d;
        w01 w01Var = w01.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((ob0) obj2).f(null);
                return w01Var;
            case 1:
                ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18 = NavigationDrawerKt.ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18((DrawerState) obj2, (Density) obj);
                return ModalNavigationDrawer_FHprtrg$lambda$24$lambda$19$lambda$18;
            case 2:
                padding$lambda$0 = PaddingKt.padding$lambda$0((PaddingValues) obj2, (InspectorInfo) obj);
                return padding$lambda$0;
            case 3:
                measurePager_7L1iB3k$lambda$18$0 = PagerMeasureKt.measurePager_7L1iB3k$lambda$18$0((List) obj2, (Placeable.PlacementScope) obj);
                return measurePager_7L1iB3k$lambda$18$0;
            case 4:
                qf0 qf0Var = (qf0) obj2;
                int intValue = ((Integer) obj).intValue();
                return qf0Var.e[intValue] + ": " + qf0Var.g(intValue).a();
            case 5:
                ki kiVar = (ki) obj;
                kiVar.getClass();
                ki.a(kiVar, "type", cs0.b);
                String str = "kotlinx.serialization.Polymorphic<" + ((ji) ((sf0) obj2).b).b() + '>';
                rf0 rf0Var = rf0.n;
                go0[] go0VarArr = new go0[0];
                if (ds0.n0(str)) {
                    o.m("Blank serial names are prohibited");
                } else {
                    if (rf0Var != ls0.m) {
                        ki kiVar2 = new ki(str);
                        ki.a(kiVar, "value", new io0(str, rf0Var, kiVar2.b.size(), ac.n0(go0VarArr), kiVar2));
                        return w01Var;
                    }
                    o.m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                }
                return null;
            case 6:
                CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9 = PullToRefreshKt.CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9((FloatProducer) obj2, (SemanticsPropertyReceiver) obj);
                return CircularArrowProgressIndicator_RPmYEkk$lambda$10$lambda$9;
            case 7:
                _init_$lambda$0 = ReceiveContentNode._init_$lambda$0((ReceiveContentNode) obj2, (DragAndDropEvent) obj);
                return _init_$lambda$0;
            case 8:
                readObserverOf$lambda$0 = Recomposer.readObserverOf$lambda$0((ControlledComposition) obj2, obj);
                return readObserverOf$lambda$0;
            case 9:
                effectJob$lambda$0$0 = Recomposer.effectJob$lambda$0$0((Recomposer) obj2, (Throwable) obj);
                return effectJob$lambda$0$0;
            case 10:
                performHandwritingGesture$lambda$0 = RecordingInputConnection.performHandwritingGesture$lambda$0((RecordingInputConnection) obj2, (EditCommand) obj);
                return performHandwritingGesture$lambda$0;
            case 11:
                mutableStateSaver$lambda$0$1 = RememberSaveableKt.mutableStateSaver$lambda$0$1((Saver) obj2, (MutableState) obj);
                return mutableStateSaver$lambda$0$1;
            case Matrix.TranslateX /* 12 */:
                fitOutside$lambda$0$1 = RulerAlignmentKt.fitOutside$lambda$0$1((Measurable) obj2, (Placeable.PlacementScope) obj);
                return fitOutside$lambda$0$1;
            case Matrix.TranslateY /* 13 */:
                scrollableState$lambda$0 = ScrollState.scrollableState$lambda$0((ScrollState) obj2, ((Float) obj).floatValue());
                return Float.valueOf(scrollableState$lambda$0);
            case Matrix.TranslateZ /* 14 */:
                _init_$lambda$02 = ScrollableNode._init_$lambda$0((ScrollableNode) obj2, (LayoutCoordinates) obj);
                return _init_$lambda$02;
            case 15:
                performScrollForOverscroll$lambda$0 = ScrollingLogic.performScrollForOverscroll$lambda$0((ScrollingLogic) obj2, (Offset) obj);
                return performScrollForOverscroll$lambda$0;
            case 16:
                SearchBar_nbWgWpA$lambda$1$lambda$0 = SearchBarKt.SearchBar_nbWgWpA$lambda$1$lambda$0((SearchBarState) obj2, (LayoutCoordinates) obj);
                return SearchBar_nbWgWpA$lambda$1$lambda$0;
            case 17:
                focusChangeModifier$lambda$0 = SecureTextFieldController.focusChangeModifier$lambda$0((SecureTextFieldController) obj2, (FocusState) obj);
                return focusChangeModifier$lambda$0;
            case 18:
                mouseSelection$lambda$0 = SelectionGesturesKt.mouseSelection$lambda$0((MouseSelectionObserver) obj2, (PointerInputChange) obj);
                return mouseSelection$lambda$0;
            case 19:
                obj.getClass();
                return ((wg) obj2).invoke();
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                io0 io0Var = (io0) obj2;
                int intValue2 = ((Integer) obj).intValue();
                return io0Var.e[intValue2] + ": " + io0Var.f[intValue2].a();
            case 21:
                extractNestedStates$lambda$1 = SlotTable.extractNestedStates$lambda$1((SlotTable) obj2, (MovableContentStateReference) obj);
                return extractNestedStates$lambda$1;
            case 22:
                component2$lambda$0 = SnapshotMutableDoubleStateImpl.component2$lambda$0((SnapshotMutableDoubleStateImpl) obj2, ((Double) obj).doubleValue());
                return component2$lambda$0;
            case 23:
                component2$lambda$02 = SnapshotMutableFloatStateImpl.component2$lambda$0((SnapshotMutableFloatStateImpl) obj2, ((Float) obj).floatValue());
                return component2$lambda$02;
            case 24:
                component2$lambda$03 = SnapshotMutableIntStateImpl.component2$lambda$0((SnapshotMutableIntStateImpl) obj2, ((Integer) obj).intValue());
                return component2$lambda$03;
            case RectListKt.BitOffsetForParentId /* 25 */:
                component2$lambda$04 = SnapshotMutableLongStateImpl.component2$lambda$0((SnapshotMutableLongStateImpl) obj2, ((Long) obj).longValue());
                return component2$lambda$04;
            case 26:
                component2$lambda$05 = SnapshotMutableStateImpl.component2$lambda$0((SnapshotMutableStateImpl) obj2, obj);
                return component2$lambda$05;
            case 27:
                readObserver$lambda$0 = SnapshotStateObserver.readObserver$lambda$0((SnapshotStateObserver) obj2, obj);
                return readObserver$lambda$0;
            case 28:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj2;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                lazyListScope.items(snapshotStateList.size(), null, new xa(snapshotStateList, 6), ComposableLambdaKt.composableLambdaInstance(802480018, true, new rt0(snapshotStateList)));
                return w01Var;
            default:
                collectTextContextMenuData$lambda$0$0 = TextContextMenuModifierKt.collectTextContextMenuData$lambda$0$0((TextContextMenuBuilderScope) obj2, (ky) obj);
                return collectTextContextMenuData$lambda$0$0;
        }
    }

    public /* synthetic */ mb0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}

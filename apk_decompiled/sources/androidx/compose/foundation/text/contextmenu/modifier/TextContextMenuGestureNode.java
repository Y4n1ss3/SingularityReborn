package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import defpackage.dq;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.vn;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class TextContextMenuGestureNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode {
    private static final Companion Companion = new Companion(null);
    private static final String MESSAGE = "Tried to open context menu before the anchor was placed.";
    private final MutableState localCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
    private my onPreShowContextMenu;

    public TextContextMenuGestureNode(my myVar) {
        this.onPreShowContextMenu = myVar;
        delegate(SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            /* renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$1$1, reason: invalid class name and collision with other inner class name */
            public static final /* synthetic */ class C00141 extends xy implements ky {
                public C00141(Object obj) {
                    super(1, obj, TextContextMenuGestureNode.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
                }

                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m1223invokek4lQ0M(((Offset) obj).m4526unboximpl());
                    return w01.a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m1223invokek4lQ0M(long j) {
                    ((TextContextMenuGestureNode) this.receiver).m1222tryShowContextMenuk4lQ0M(j);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, hm hmVar) {
                Object onRightClickDown = RightClickGesturesKt.onRightClickDown(pointerInputScope, new C00141(TextContextMenuGestureNode.this), hmVar);
                return onRightClickDown == vn.d ? onRightClickDown : w01.a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getLocalCoordinates() {
        return (LayoutCoordinates) this.localCoordinates$delegate.getValue();
    }

    private final void setLocalCoordinates(LayoutCoordinates layoutCoordinates) {
        this.localCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryShowContextMenu-k-4lQ0M, reason: not valid java name */
    public final void m1222tryShowContextMenuk4lQ0M(long j) {
        TextContextMenuProvider textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuDropdownProvider());
        if (textContextMenuProvider == null) {
            return;
        }
        p01.t(getCoroutineScope(), null, null, new TextContextMenuGestureNode$tryShowContextMenu$1(this, j, textContextMenuProvider, new ClickTextContextMenuDataProvider(this, j, null), null), 3);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        setLocalCoordinates(layoutCoordinates);
    }

    public final void update(my myVar) {
        this.onPreShowContextMenu = myVar;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public final class ClickTextContextMenuDataProvider implements TextContextMenuDataProvider {
        private final long localClickOffset;

        private ClickTextContextMenuDataProvider(long j) {
            this.localClickOffset = j;
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public Rect contentBounds(LayoutCoordinates layoutCoordinates) {
            return RectKt.m4556Recttz77jQw(mo1224positiontuRUvjQ(layoutCoordinates), Size.Companion.m4594getZeroNHjbRc());
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        public TextContextMenuData data() {
            return TextContextMenuModifierKt.collectTextContextMenuData(TextContextMenuGestureNode.this);
        }

        @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
        /* renamed from: position-tuRUvjQ, reason: not valid java name */
        public long mo1224positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
            LayoutCoordinates localCoordinates = TextContextMenuGestureNode.this.getLocalCoordinates();
            if (localCoordinates != null) {
                return layoutCoordinates.mo6243localPositionOfR5De75A(localCoordinates, this.localClickOffset);
            }
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(TextContextMenuGestureNode.MESSAGE);
            o.j();
            return 0L;
        }

        public /* synthetic */ ClickTextContextMenuDataProvider(TextContextMenuGestureNode textContextMenuGestureNode, long j, dq dqVar) {
            this(j);
        }
    }
}

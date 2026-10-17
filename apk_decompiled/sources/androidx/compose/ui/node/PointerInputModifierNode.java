package androidx.compose.ui.node;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    default long mo1225getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m6674getNoneRZrCHBk();
    }

    default boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    void onCancelPointerInput();

    default void onDensityChange() {
        onCancelPointerInput();
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    void mo197onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j);

    default void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    default boolean sharePointerInputWithSiblings() {
        return false;
    }
}

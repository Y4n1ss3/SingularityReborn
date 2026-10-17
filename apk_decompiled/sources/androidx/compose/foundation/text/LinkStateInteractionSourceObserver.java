package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import defpackage.hm;
import defpackage.jw;
import defpackage.vn;
import defpackage.w01;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;
    private final InteractionSource interactionSource;
    private final int Focused = 1;
    private final int Hovered = 2;
    private final int Pressed = 4;
    private final MutableIntState interactionState = SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final Object collectInteractionsForLinks(hm hmVar) {
        final xa0 xa0Var = new xa0();
        Object collect = this.interactionSource.getInteractions().collect(new jw() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver$collectInteractionsForLinks$2
            @Override // defpackage.jw
            public final Object emit(Interaction interaction, hm hmVar2) {
                MutableIntState mutableIntState;
                int i;
                if ((interaction instanceof HoverInteraction.Enter) || (interaction instanceof FocusInteraction.Focus) || (interaction instanceof PressInteraction.Press)) {
                    xa0.this.g(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    xa0.this.k(((HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    xa0.this.k(((FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof PressInteraction.Release) {
                    xa0.this.k(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    xa0.this.k(((PressInteraction.Cancel) interaction).getPress());
                }
                xa0 xa0Var2 = xa0.this;
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                Object[] objArr = xa0Var2.a;
                int i2 = xa0Var2.b;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Interaction interaction2 = (Interaction) objArr[i4];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i = linkStateInteractionSourceObserver.Pressed;
                    }
                    i3 |= i;
                }
                mutableIntState = this.interactionState;
                mutableIntState.setIntValue(i3);
                return w01.a;
            }
        }, hmVar);
        return collect == vn.d ? collect : w01.a;
    }

    public final boolean isFocused() {
        return (this.Focused & this.interactionState.getIntValue()) != 0;
    }

    public final boolean isHovered() {
        return (this.Hovered & this.interactionState.getIntValue()) != 0;
    }

    public final boolean isPressed() {
        return (this.Pressed & this.interactionState.getIntValue()) != 0;
    }
}

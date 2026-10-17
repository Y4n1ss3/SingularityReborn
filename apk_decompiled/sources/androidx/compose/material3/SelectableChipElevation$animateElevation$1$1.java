package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SelectableChipElevation$animateElevation$1$1", f = "Chip.kt", l = {2505}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SelectableChipElevation$animateElevation$1$1 extends us0 implements my {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableChipElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SelectableChipElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SelectableChipElevation$animateElevation$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            iw interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            jw jwVar = new jw() { // from class: androidx.compose.material3.SelectableChipElevation$animateElevation$1$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        snapshotStateList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        snapshotStateList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        snapshotStateList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        snapshotStateList.remove(((DragInteraction.Cancel) interaction).getStart());
                    }
                    return w01.a;
                }
            };
            this.label = 1;
            Object collect = interactions.collect(jwVar, this);
            vn vnVar = vn.d;
            if (collect == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}

package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LabelKt$HandleInteractions$1$1 extends us0 implements my {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TooltipState $state;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ TooltipState $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TooltipState tooltipState, hm hmVar) {
            super(2, hmVar);
            this.$state = tooltipState;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(Interaction interaction, hm hmVar) {
            return ((AnonymousClass1) create(interaction, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                Interaction interaction = (Interaction) this.L$0;
                if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction.Start) || (interaction instanceof HoverInteraction.Enter)) {
                    TooltipState tooltipState = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    Object show = tooltipState.show(mutatePriority, this);
                    vn vnVar = vn.d;
                    if (show == vnVar) {
                        return vnVar;
                    }
                } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof DragInteraction.Stop) || (interaction instanceof HoverInteraction.Exit)) {
                    this.$state.dismiss();
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = mutableInteractionSource;
        this.$state = tooltipState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, this.$state, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((LabelKt$HandleInteractions$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            iw interactions = this.$interactionSource.getInteractions();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
            this.label = 1;
            Object k = y80.k(interactions, anonymousClass1, this);
            vn vnVar = vn.d;
            if (k == vnVar) {
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

package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.runtime.MutableState;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", l = {82}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class DragInteractionKt$collectIsDraggedAsState$1$1 extends us0 implements my {
    final /* synthetic */ MutableState<Boolean> $isDragged;
    final /* synthetic */ InteractionSource $this_collectIsDraggedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragInteractionKt$collectIsDraggedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, hm hmVar) {
        super(2, hmVar);
        this.$this_collectIsDraggedAsState = interactionSource;
        this.$isDragged = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new DragInteractionKt$collectIsDraggedAsState$1$1(this.$this_collectIsDraggedAsState, this.$isDragged, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((DragInteractionKt$collectIsDraggedAsState$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final ArrayList arrayList = new ArrayList();
            iw interactions = this.$this_collectIsDraggedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isDragged;
            jw jwVar = new jw() { // from class: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    if (interaction instanceof DragInteraction.Start) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        arrayList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        arrayList.remove(((DragInteraction.Cancel) interaction).getStart());
                    }
                    mutableState.setValue(Boolean.valueOf(!arrayList.isEmpty()));
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
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        return w01.a;
    }
}

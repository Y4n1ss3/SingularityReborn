package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.jw;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarKt$DetectClickFromInteractionSource$1$1", f = "SearchBar.kt", l = {2595}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarKt$DetectClickFromInteractionSource$1$1 extends us0 implements my {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ iy $onClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$DetectClickFromInteractionSource$1$1(InteractionSource interactionSource, iy iyVar, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = interactionSource;
        this.$onClick = iyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarKt$DetectClickFromInteractionSource$1$1(this.$interactionSource, this.$onClick, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarKt$DetectClickFromInteractionSource$1$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            iw interactions = this.$interactionSource.getInteractions();
            final iy iyVar = this.$onClick;
            jw jwVar = new jw() { // from class: androidx.compose.material3.SearchBarKt$DetectClickFromInteractionSource$1$1.1
                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    if (interaction instanceof PressInteraction.Release) {
                        iy.this.invoke();
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

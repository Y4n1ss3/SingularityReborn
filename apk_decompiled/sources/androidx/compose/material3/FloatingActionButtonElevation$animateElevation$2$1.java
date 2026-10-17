package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.jw;
import defpackage.my;
import defpackage.p01;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.yi;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class FloatingActionButtonElevation$animateElevation$2$1 extends us0 implements my {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, hm hmVar) {
        super(2, hmVar);
        this.$interactionSource = interactionSource;
        this.$animatable = floatingActionButtonElevationAnimatable;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.$interactionSource, this.$animatable, hmVar);
        floatingActionButtonElevation$animateElevation$2$1.L$0 = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            final un unVar = (un) this.L$0;
            final ArrayList arrayList = new ArrayList();
            iw interactions = this.$interactionSource.getInteractions();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            jw jwVar = new jw() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", l = {676}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00181 extends us0 implements my {
                    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
                    final /* synthetic */ Interaction $targetInteraction;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00181(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, hm hmVar) {
                        super(2, hmVar);
                        this.$animatable = floatingActionButtonElevationAnimatable;
                        this.$targetInteraction = interaction;
                    }

                    @Override // defpackage.mc
                    public final hm create(Object obj, hm hmVar) {
                        return new C00181(this.$animatable, this.$targetInteraction, hmVar);
                    }

                    @Override // defpackage.my
                    public final Object invoke(un unVar, hm hmVar) {
                        return ((C00181) create(unVar, hmVar)).invokeSuspend(w01.a);
                    }

                    @Override // defpackage.mc
                    public final Object invokeSuspend(Object obj) {
                        int i = this.label;
                        if (i == 0) {
                            p10.Q(obj);
                            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
                            Interaction interaction = this.$targetInteraction;
                            this.label = 1;
                            Object animateElevation = floatingActionButtonElevationAnimatable.animateElevation(interaction, this);
                            vn vnVar = vn.d;
                            if (animateElevation == vnVar) {
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

                @Override // defpackage.jw
                public final Object emit(Interaction interaction, hm hmVar) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    p01.t(unVar, null, null, new C00181(floatingActionButtonElevationAnimatable, (Interaction) yi.w0(arrayList), null), 3);
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

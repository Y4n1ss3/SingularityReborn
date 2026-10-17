package androidx.compose.material3.internal;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import defpackage.bq;
import defpackage.dq;
import defpackage.hm;
import defpackage.im;
import defpackage.iw;
import defpackage.jw;
import defpackage.o;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MappedInteractionSource implements InteractionSource {
    public static final int $stable = 0;
    private final long delta;
    private final iw interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    private MappedInteractionSource(InteractionSource interactionSource, long j) {
        this.delta = j;
        this.mappedPresses = new LinkedHashMap();
        final iw interactions = interactionSource.getInteractions();
        this.interactions = new iw() { // from class: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1

            /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
            /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements jw {
                final /* synthetic */ jw $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
                @bq(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {219}, m = "emit")
                /* renamed from: androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends im {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(hm hmVar) {
                        super(hmVar);
                    }

                    @Override // defpackage.mc
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(jw jwVar, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = jwVar;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // defpackage.jw
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, hm hmVar) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    Map map;
                    Map map2;
                    Interaction interaction;
                    PressInteraction.Press mapPress;
                    Map map3;
                    if (hmVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) hmVar;
                        int i2 = anonymousClass1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i2 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                p10.Q(obj2);
                                jw jwVar = this.$this_unsafeFlow;
                                Interaction interaction2 = (Interaction) obj;
                                if (interaction2 instanceof PressInteraction.Press) {
                                    mapPress = this.this$0.mapPress((PressInteraction.Press) interaction2);
                                    map3 = this.this$0.mappedPresses;
                                    map3.put(interaction2, mapPress);
                                    interaction = mapPress;
                                } else if (interaction2 instanceof PressInteraction.Cancel) {
                                    map2 = this.this$0.mappedPresses;
                                    PressInteraction.Cancel cancel = (PressInteraction.Cancel) interaction2;
                                    PressInteraction.Press press = (PressInteraction.Press) map2.remove(cancel.getPress());
                                    interaction = cancel;
                                    if (press != null) {
                                        interaction = new PressInteraction.Cancel(press);
                                    }
                                } else {
                                    boolean z = interaction2 instanceof PressInteraction.Release;
                                    interaction = interaction2;
                                    if (z) {
                                        map = this.this$0.mappedPresses;
                                        PressInteraction.Release release = (PressInteraction.Release) interaction2;
                                        PressInteraction.Press press2 = (PressInteraction.Press) map.remove(release.getPress());
                                        interaction = release;
                                        if (press2 != null) {
                                            interaction = new PressInteraction.Release(press2);
                                        }
                                    }
                                }
                                anonymousClass1.label = 1;
                                Object emit = jwVar.emit(interaction, anonymousClass1);
                                vn vnVar = vn.d;
                                if (emit == vnVar) {
                                    return vnVar;
                                }
                            } else {
                                if (i != 1) {
                                    o.f("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                p10.Q(obj2);
                            }
                            return w01.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(hmVar);
                    Object obj22 = anonymousClass1.result;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return w01.a;
                }
            }

            @Override // defpackage.iw
            public Object collect(jw jwVar, hm hmVar) {
                Object collect = iw.this.collect(new AnonymousClass2(jwVar, this), hmVar);
                return collect == vn.d ? collect : w01.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m4520minusMKHz9U(press.m588getPressPositionF1C5BW0(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public iw getInteractions() {
        return this.interactions;
    }

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j, dq dqVar) {
        this(interactionSource, j);
    }
}

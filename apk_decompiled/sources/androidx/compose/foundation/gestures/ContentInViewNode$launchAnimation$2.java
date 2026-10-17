package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.IntOffset;
import defpackage.bq;
import defpackage.cq;
import defpackage.hm;
import defpackage.iy;
import defpackage.my;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.z10;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {282}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class ContentInViewNode$launchAnimation$2 extends us0 implements my {

    /* renamed from: $$v$c$androidx-compose-ui-unit-IntOffset$-viewportAdjustmentForReverseScroll$0, reason: not valid java name */
    final /* synthetic */ long f8x677d03b0;
    final /* synthetic */ UpdatableAnimationState $animationState;
    final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {289}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {

        /* renamed from: $$v$c$androidx-compose-ui-unit-IntOffset$-viewportAdjustmentForReverseScroll$0, reason: not valid java name */
        final /* synthetic */ long f9x677d03b0;
        final /* synthetic */ z10 $animationJob;
        final /* synthetic */ UpdatableAnimationState $animationState;
        final /* synthetic */ BringIntoViewSpec $bringIntoViewSpec;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UpdatableAnimationState updatableAnimationState, ContentInViewNode contentInViewNode, BringIntoViewSpec bringIntoViewSpec, long j, z10 z10Var, hm hmVar) {
            super(2, hmVar);
            this.$animationState = updatableAnimationState;
            this.this$0 = contentInViewNode;
            this.$bringIntoViewSpec = bringIntoViewSpec;
            this.f9x677d03b0 = j;
            this.$animationJob = z10Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 invokeSuspend$lambda$0(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, z10 z10Var, NestedScrollScope nestedScrollScope, float f) {
            boolean z;
            ScrollingLogic scrollingLogic;
            z = contentInViewNode.reverseDirection;
            float f2 = z ? 1.0f : -1.0f;
            scrollingLogic = contentInViewNode.scrollingLogic;
            float m549toFloatk4lQ0M = scrollingLogic.m549toFloatk4lQ0M(scrollingLogic.m547reverseIfNeededMKHz9U(nestedScrollScope.mo491scrollByOzD1aCk(scrollingLogic.m547reverseIfNeededMKHz9U(scrollingLogic.m550toOffsettuRUvjQ(f2 * f)), NestedScrollSource.Companion.m5969getUserInputWNlRxjI()))) * f2;
            if (Math.abs(m549toFloatk4lQ0M) < Math.abs(f)) {
                CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + m549toFloatk4lQ0M + " < " + f + ')');
                cancellationException.initCause(null);
                z10Var.cancel(cancellationException);
            }
            return w01.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
        
            r5 = r4.getFocusedChildBounds();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final w01 invokeSuspend$lambda$1(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec) {
            w01 w01Var;
            ContentInViewNode contentInViewNode2;
            boolean z;
            float m393calculateScrollDeltaI_oMVgE;
            Rect focusedChildBounds;
            boolean m397isMaxVisibleEQwtKw$default;
            BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewNode.bringIntoViewRequests;
            while (true) {
                int size = bringIntoViewRequestPriorityQueue.requests.getSize();
                w01Var = w01.a;
                if (size == 0) {
                    contentInViewNode2 = contentInViewNode;
                    break;
                }
                Rect rect = (Rect) ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.last()).getCurrentBounds().invoke();
                if (rect == null) {
                    contentInViewNode2 = contentInViewNode;
                    m397isMaxVisibleEQwtKw$default = true;
                } else {
                    contentInViewNode2 = contentInViewNode;
                    m397isMaxVisibleEQwtKw$default = ContentInViewNode.m397isMaxVisibleEQwtKw$default(contentInViewNode2, rect, 0L, 0L, 3, null);
                }
                if (!m397isMaxVisibleEQwtKw$default) {
                    break;
                }
                ((ContentInViewNode.Request) bringIntoViewRequestPriorityQueue.requests.removeAt(bringIntoViewRequestPriorityQueue.requests.getSize() - 1)).getContinuation().resumeWith(w01Var);
                contentInViewNode = contentInViewNode2;
            }
            z = contentInViewNode2.trackingFocusedChild;
            if (z && focusedChildBounds != null && ContentInViewNode.m397isMaxVisibleEQwtKw$default(contentInViewNode2, focusedChildBounds, 0L, 0L, 3, null)) {
                contentInViewNode2.trackingFocusedChild = false;
            }
            m393calculateScrollDeltaI_oMVgE = contentInViewNode2.m393calculateScrollDeltaI_oMVgE(bringIntoViewSpec, IntOffset.Companion.m7750getZeronOccac());
            updatableAnimationState.setValue(m393calculateScrollDeltaI_oMVgE);
            return w01Var;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.f9x677d03b0, this.$animationJob, hmVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.my
        public final Object invoke(NestedScrollScope nestedScrollScope, hm hmVar) {
            return ((AnonymousClass1) create(nestedScrollScope, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            float m393calculateScrollDeltaI_oMVgE;
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
                UpdatableAnimationState updatableAnimationState = this.$animationState;
                m393calculateScrollDeltaI_oMVgE = this.this$0.m393calculateScrollDeltaI_oMVgE(this.$bringIntoViewSpec, this.f9x677d03b0);
                updatableAnimationState.setValue(m393calculateScrollDeltaI_oMVgE);
                final UpdatableAnimationState updatableAnimationState2 = this.$animationState;
                final ContentInViewNode contentInViewNode = this.this$0;
                e eVar = new e(contentInViewNode, updatableAnimationState2, this.$animationJob, nestedScrollScope, 0);
                final BringIntoViewSpec bringIntoViewSpec = this.$bringIntoViewSpec;
                iy iyVar = new iy() { // from class: androidx.compose.foundation.gestures.f
                    @Override // defpackage.iy
                    public final Object invoke() {
                        w01 invokeSuspend$lambda$1;
                        invokeSuspend$lambda$1 = ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$1(ContentInViewNode.this, updatableAnimationState2, bringIntoViewSpec);
                        return invokeSuspend$lambda$1;
                    }
                };
                this.label = 1;
                Object animateToZero = updatableAnimationState2.animateToZero(eVar, iyVar, this);
                vn vnVar = vn.d;
                if (animateToZero == vnVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, UpdatableAnimationState updatableAnimationState, BringIntoViewSpec bringIntoViewSpec, long j, hm hmVar) {
        super(2, hmVar);
        this.this$0 = contentInViewNode;
        this.$animationState = updatableAnimationState;
        this.$bringIntoViewSpec = bringIntoViewSpec;
        this.f8x677d03b0 = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, this.$animationState, this.$bringIntoViewSpec, this.f8x677d03b0, hmVar);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((ContentInViewNode$launchAnimation$2) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        int i = this.label;
        CancellationException cancellationException = null;
        try {
            try {
                if (i == 0) {
                    p10.Q(obj);
                    z10 s = cq.s(((un) this.L$0).getCoroutineContext());
                    this.this$0.isAnimationRunning = true;
                    scrollingLogic = this.this$0.scrollingLogic;
                    MutatePriority mutatePriority = MutatePriority.Default;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.f8x677d03b0, s, null);
                    this.label = 1;
                    Object scroll = scrollingLogic.scroll(mutatePriority, anonymousClass1, this);
                    vn vnVar = vn.d;
                    if (scroll == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                this.this$0.bringIntoViewRequests.resumeAndRemoveAll();
                this.this$0.isAnimationRunning = false;
                this.this$0.bringIntoViewRequests.cancelAndRemoveAll(null);
                this.this$0.trackingFocusedChild = false;
                return w01.a;
            } catch (CancellationException e) {
                cancellationException = e;
                throw cancellationException;
            }
        } catch (Throwable th) {
            this.this$0.isAnimationRunning = false;
            this.this$0.bringIntoViewRequests.cancelAndRemoveAll(cancellationException);
            this.this$0.trackingFocusedChild = false;
            throw th;
        }
    }
}

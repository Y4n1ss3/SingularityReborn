package androidx.compose.material3;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import defpackage.bq;
import defpackage.hi0;
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
import defpackage.zw;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1", f = "SearchBar.kt", l = {1442}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SearchBarDefaults$InputField$9$1 extends us0 implements my {
    final /* synthetic */ un $coroutineScope;
    final /* synthetic */ State<Boolean> $focused$delegate;
    final /* synthetic */ SearchBarState $searchBarState;
    final /* synthetic */ TextFieldState $textFieldState;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends us0 implements my {
        final /* synthetic */ un $coroutineScope;
        final /* synthetic */ State<Boolean> $focused$delegate;
        final /* synthetic */ hi0 $prevLength;
        final /* synthetic */ SearchBarState $searchBarState;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1", f = "SearchBar.kt", l = {1438}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material3.SearchBarDefaults$InputField$9$1$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends us0 implements my {
            final /* synthetic */ SearchBarState $searchBarState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SearchBarState searchBarState, hm hmVar) {
                super(2, hmVar);
                this.$searchBarState = searchBarState;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new AnonymousClass1(this.$searchBarState, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    p10.Q(obj);
                    SearchBarState searchBarState = this.$searchBarState;
                    this.label = 1;
                    Object animateToExpanded = searchBarState.animateToExpanded(this);
                    vn vnVar = vn.d;
                    if (animateToExpanded == vnVar) {
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
        public AnonymousClass2(hi0 hi0Var, SearchBarState searchBarState, un unVar, State<Boolean> state, hm hmVar) {
            super(2, hmVar);
            this.$prevLength = hi0Var;
            this.$searchBarState = searchBarState;
            this.$coroutineScope = unVar;
            this.$focused$delegate = state;
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$prevLength, this.$searchBarState, this.$coroutineScope, this.$focused$delegate, hmVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.my
        public final Object invoke(CharSequence charSequence, hm hmVar) {
            return ((AnonymousClass2) create(charSequence, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            boolean InputField$lambda$5;
            boolean isExpanded;
            if (this.label != 0) {
                defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
            int length = ((CharSequence) this.L$0).length();
            if (length > this.$prevLength.d) {
                InputField$lambda$5 = SearchBarDefaults.InputField$lambda$5(this.$focused$delegate);
                if (InputField$lambda$5) {
                    isExpanded = SearchBarKt.isExpanded(this.$searchBarState);
                    if (!isExpanded) {
                        p01.t(this.$coroutineScope, null, null, new AnonymousClass1(this.$searchBarState, null), 3);
                    }
                }
            }
            this.$prevLength.d = length;
            return w01.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarDefaults$InputField$9$1(SearchBarState searchBarState, TextFieldState textFieldState, un unVar, State<Boolean> state, hm hmVar) {
        super(2, hmVar);
        this.$searchBarState = searchBarState;
        this.$textFieldState = textFieldState;
        this.$coroutineScope = unVar;
        this.$focused$delegate = state;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new SearchBarDefaults$InputField$9$1(this.$searchBarState, this.$textFieldState, this.$coroutineScope, this.$focused$delegate, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((SearchBarDefaults$InputField$9$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        boolean isExpanded;
        int i = this.label;
        w01 w01Var = w01.a;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return w01Var;
            }
            defpackage.o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        isExpanded = SearchBarKt.isExpanded(this.$searchBarState);
        if (!isExpanded) {
            hi0 hi0Var = new hi0();
            hi0Var.d = this.$textFieldState.getText().length();
            iw snapshotFlow = SnapshotStateKt.snapshotFlow(new f(this.$textFieldState, 5));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(hi0Var, this.$searchBarState, this.$coroutineScope, this.$focused$delegate, null);
            jw jwVar = new jw() { // from class: androidx.compose.material3.SearchBarDefaults$InputField$9$1.3
                @Override // defpackage.jw
                public final Object emit(CharSequence charSequence, hm hmVar) {
                    return w01.a;
                }
            };
            this.label = 1;
            Object collect = snapshotFlow.collect(new zw(jwVar, anonymousClass2), this);
            vn vnVar = vn.d;
            if (collect != vnVar) {
                collect = w01Var;
            }
            if (collect == vnVar) {
                return vnVar;
            }
        }
        return w01Var;
    }
}

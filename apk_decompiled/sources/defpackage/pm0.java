package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class pm0 implements TextWatcher {
    public final /* synthetic */ SearchView a;

    public pm0(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        SearchView searchView = this.a;
        Editable text = searchView.s.getText();
        searchView.b0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        searchView.o(!isEmpty);
        int i4 = 8;
        if (searchView.a0 && !searchView.Q && isEmpty) {
            searchView.x.setVisibility(8);
            i4 = 0;
        }
        searchView.z.setVisibility(i4);
        searchView.k();
        searchView.n();
        charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}

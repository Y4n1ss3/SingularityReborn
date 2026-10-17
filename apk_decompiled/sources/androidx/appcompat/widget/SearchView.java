package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.graphics.Fields;
import com.lumi.singularity.R;
import defpackage.aj0;
import defpackage.an0;
import defpackage.c8;
import defpackage.e50;
import defpackage.l7;
import defpackage.os0;
import defpackage.pm0;
import defpackage.qm0;
import defpackage.rm0;
import defpackage.s11;
import defpackage.sm0;
import defpackage.tm0;
import defpackage.u11;
import defpackage.um0;
import defpackage.vh0;
import defpackage.vm0;
import defpackage.wm0;
import defpackage.wv0;
import defpackage.xm0;
import defpackage.xo;
import defpackage.ym0;
import defpackage.zm0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public class SearchView extends e50 {
    public static final /* synthetic */ int h0 = 0;
    public final View A;
    public an0 B;
    public final Rect C;
    public final Rect D;
    public final int[] E;
    public final int[] F;
    public final ImageView G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final Intent K;
    public final Intent L;
    public final CharSequence M;
    public View.OnFocusChangeListener N;
    public View.OnClickListener O;
    public boolean P;
    public boolean Q;
    public xo R;
    public boolean S;
    public CharSequence T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean a0;
    public Editable b0;
    public SearchableInfo c0;
    public Bundle d0;
    public final qm0 e0;
    public final qm0 f0;
    public final WeakHashMap g0;
    public final SearchAutoComplete s;
    public final View t;
    public final View u;
    public final View v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final ImageView z;

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        int i2 = 1;
        this.d = true;
        this.e = -1;
        int i3 = 0;
        this.f = 0;
        this.h = 8388659;
        int[] iArr = vh0.d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        int i4 = u11.a;
        s11.a(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i5 = obtainStyledAttributes.getInt(1, -1);
        if (i5 >= 0) {
            setOrientation(i5);
        }
        int i6 = obtainStyledAttributes.getInt(0, -1);
        if (i6 >= 0) {
            setGravity(i6);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.j = obtainStyledAttributes.getFloat(4, -1.0f);
        this.e = obtainStyledAttributes.getInt(3, -1);
        this.k = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : aj0.c().d(context, resourceId));
        this.q = obtainStyledAttributes.getInt(8, 0);
        this.r = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
        this.C = new Rect();
        this.D = new Rect();
        this.E = new int[2];
        this.F = new int[2];
        this.e0 = new qm0(this, i3);
        this.f0 = new qm0(this, i2);
        this.g0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        tm0 tm0Var = new tm0(this);
        um0 um0Var = new um0(this);
        vm0 vm0Var = new vm0(this);
        pm0 pm0Var = new pm0(this);
        int[] iArr2 = vh0.e;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        c8 c8Var = new c8(context, obtainStyledAttributes2);
        s11.a(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        LayoutInflater.from(context).inflate(obtainStyledAttributes2.getResourceId(17, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.t = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.u = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.v = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.w = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.G = imageView5;
        findViewById.setBackground(c8Var.d(18));
        findViewById2.setBackground(c8Var.d(23));
        imageView.setImageDrawable(c8Var.d(21));
        imageView2.setImageDrawable(c8Var.d(13));
        imageView3.setImageDrawable(c8Var.d(10));
        imageView4.setImageDrawable(c8Var.d(26));
        imageView5.setImageDrawable(c8Var.d(21));
        this.H = c8Var.d(20);
        wv0.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.I = obtainStyledAttributes2.getResourceId(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.J = obtainStyledAttributes2.getResourceId(11, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(pm0Var);
        searchAutoComplete.setOnEditorActionListener(tm0Var);
        searchAutoComplete.setOnItemClickListener(um0Var);
        searchAutoComplete.setOnItemSelectedListener(vm0Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new rm0(this));
        setIconifiedByDefault(obtainStyledAttributes2.getBoolean(16, true));
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.M = obtainStyledAttributes2.getText(12);
        this.T = obtainStyledAttributes2.getText(19);
        int i7 = obtainStyledAttributes2.getInt(6, -1);
        if (i7 != -1) {
            setImeOptions(i7);
        }
        int i8 = obtainStyledAttributes2.getInt(5, -1);
        if (i8 != -1) {
            setInputType(i8);
        }
        setFocusable(obtainStyledAttributes2.getBoolean(1, true));
        c8Var.k();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K = intent;
        intent.addFlags(GroupFlagsKt.IsMovableContentFlag);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.L = intent2;
        intent2.addFlags(GroupFlagsKt.IsMovableContentFlag);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new sm0(this));
        }
        p(this.P);
        m();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.V = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.V = false;
    }

    public final Intent d(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(GroupFlagsKt.IsMovableContentFlag);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.b0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.d0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.c0.getSearchActivity());
        return intent;
    }

    public final Intent e(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.d0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void f() {
        SearchAutoComplete searchAutoComplete = this.s;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.P) {
            clearFocus();
            p(true);
        }
    }

    public final void g(int i) {
        int i2;
        String g;
        Cursor cursor = this.R.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = os0.x;
                String g2 = os0.g(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (g2 == null) {
                    g2 = this.c0.getSuggestIntentAction();
                }
                if (g2 == null) {
                    g2 = "android.intent.action.SEARCH";
                }
                String g3 = os0.g(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (g3 == null) {
                    g3 = this.c0.getSuggestIntentData();
                }
                if (g3 != null && (g = os0.g(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    g3 = g3 + "/" + Uri.encode(g);
                }
                intent = d(g2, g3 == null ? null : Uri.parse(g3), os0.g(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), os0.g(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public int getImeOptions() {
        return this.s.getImeOptions();
    }

    public int getInputType() {
        return this.s.getInputType();
    }

    public int getMaxWidth() {
        return this.W;
    }

    public CharSequence getQuery() {
        return this.s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.c0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.M : getContext().getText(this.c0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J;
    }

    public int getSuggestionRowLayout() {
        return this.I;
    }

    public xo getSuggestionsAdapter() {
        return this.R;
    }

    public final void h(int i) {
        Editable text = this.s.getText();
        Cursor cursor = this.R.c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String c = this.R.c(cursor);
        if (c != null) {
            setQuery(c);
        } else {
            setQuery(text);
        }
    }

    public final void i(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void j() {
        SearchAutoComplete searchAutoComplete = this.s;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.c0 != null) {
            getContext().startActivity(d("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void k() {
        boolean isEmpty = TextUtils.isEmpty(this.s.getText());
        int i = !isEmpty || this.P ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!isEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void l() {
        int[] iArr = this.s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void m() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.P;
        SearchAutoComplete searchAutoComplete = this.s;
        if (z && (drawable = this.H) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void n() {
        this.v.setVisibility(((this.S || this.a0) && !this.Q && (this.x.getVisibility() == 0 || this.z.getVisibility() == 0)) ? 0 : 8);
    }

    public final void o(boolean z) {
        boolean z2 = this.S;
        this.x.setVisibility((!z2 || !(z2 || this.a0) || this.Q || !hasFocus() || (!z && this.a0)) ? 8 : 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.e0);
        post(this.f0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.e50, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.s;
            int[] iArr = this.E;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.F;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.C;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.D;
            rect2.set(i7, 0, i8, i9);
            an0 an0Var = this.B;
            if (an0Var == null) {
                an0 an0Var2 = new an0(rect2, rect, searchAutoComplete);
                this.B = an0Var2;
                setTouchDelegate(an0Var2);
            } else {
                an0Var.b.set(rect2);
                Rect rect3 = an0Var.d;
                rect3.set(rect2);
                int i10 = -an0Var.e;
                rect3.inset(i10, i10);
                an0Var.c.set(rect);
            }
        }
    }

    @Override // defpackage.e50, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.Q) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.W;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.W) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, GroupFlagsKt.IsSubcompositionContextFlag), View.MeasureSpec.makeMeasureSpec(size2, GroupFlagsKt.IsSubcompositionContextFlag));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zm0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zm0 zm0Var = (zm0) parcelable;
        super.onRestoreInstanceState(zm0Var.d);
        p(zm0Var.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        zm0 zm0Var = new zm0(super.onSaveInstanceState());
        zm0Var.f = this.Q;
        return zm0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.e0);
    }

    public final void p(boolean z) {
        this.Q = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean isEmpty = TextUtils.isEmpty(this.s.getText());
        this.w.setVisibility(i2);
        o(!isEmpty);
        this.t.setVisibility(z ? 8 : 0);
        ImageView imageView = this.G;
        imageView.setVisibility((imageView.getDrawable() == null || this.P) ? 8 : 0);
        k();
        if (this.a0 && !this.Q && isEmpty) {
            this.x.setVisibility(8);
            i = 0;
        }
        this.z.setVisibility(i);
        n();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.V || !isFocusable()) {
            return false;
        }
        if (this.Q) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.s.requestFocus(i, rect);
        if (requestFocus) {
            p(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.d0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            f();
            return;
        }
        p(false);
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.P == z) {
            return;
        }
        this.P = z;
        p(z);
        m();
    }

    public void setImeOptions(int i) {
        this.s.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.s.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.W = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.O = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.T = charSequence;
        m();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.U = z;
        xo xoVar = this.R;
        if (xoVar instanceof os0) {
            ((os0) xoVar).p = z ? 2 : 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.c0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.s;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.c0.getImeOptions());
            int inputType = this.c0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.c0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            xo xoVar = this.R;
            if (xoVar != null) {
                xoVar.b(null);
            }
            if (this.c0.getSuggestAuthority() != null) {
                os0 os0Var = new os0(getContext(), this, this.c0, this.g0);
                this.R = os0Var;
                searchAutoComplete.setAdapter(os0Var);
                ((os0) this.R).p = this.U ? 2 : 1;
            }
            m();
        }
        SearchableInfo searchableInfo2 = this.c0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.c0.getVoiceSearchLaunchWebSearch()) {
                intent = this.K;
            } else if (this.c0.getVoiceSearchLaunchRecognizer()) {
                intent = this.L;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.a0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        p(this.Q);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.S = z;
        p(this.Q);
    }

    public void setSuggestionsAdapter(xo xoVar) {
        this.R = xoVar;
        this.s.setAdapter(xoVar);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class SearchAutoComplete extends l7 {
        public int h;
        public SearchView i;
        public boolean j;
        public final d k;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.k = new d(this);
            this.h = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return Fields.RotationX;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.h <= 0 || super.enoughToFilter();
        }

        @Override // defpackage.l7, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.j) {
                d dVar = this.k;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.i;
            searchView.p(searchView.Q);
            searchView.post(searchView.e0);
            SearchAutoComplete searchAutoComplete = searchView.s;
            if (searchAutoComplete.hasFocus()) {
                c.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.i.hasFocus() && getVisibility() == 0) {
                this.j = true;
                Context context = getContext();
                int i = SearchView.h0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    c.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.k;
            if (!z) {
                this.j = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.j = true;
                    return;
                }
                this.j = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.h = i;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(wm0 wm0Var) {
    }

    public void setOnQueryTextListener(xm0 xm0Var) {
    }

    public void setOnSuggestionListener(ym0 ym0Var) {
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }
}

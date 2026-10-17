package defpackage;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class ns0 {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public ns0(View view) {
        this.a = (TextView) view.findViewById(R.id.text1);
        this.b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(R.id.icon1);
        this.d = (ImageView) view.findViewById(R.id.icon2);
        this.e = (ImageView) view.findViewById(com.lumi.singularity.R.id.edit_query);
    }
}

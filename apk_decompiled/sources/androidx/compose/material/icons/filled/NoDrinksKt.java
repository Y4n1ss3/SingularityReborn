package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoDrinksKt {
    private static ImageVector _noDrinks;

    public static final ImageVector getNoDrinks(Icons.Filled filled) {
        ImageVector imageVector = _noDrinks;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoDrinks", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(5.83f, 3.0f, 21.0f, 2.0f);
        q.lineToRelative(-6.2f, 6.97f);
        q.lineTo(9.83f, 7.0f);
        r6.t(q, 6.74f, 1.78f, -2.0f, 7.83f);
        uo.l(q, 5.83f, 3.0f, 19.78f, 22.61f);
        uf.u(q, 18.0f, 20.83f, 21.0f, 6.0f);
        kf0.z(q, -2.0f, 5.0f, -5.0f);
        q.lineToRelative(-1.37f, -1.54f);
        q.lineTo(1.39f, 4.22f);
        q.lineToRelative(1.41f, -1.41f);
        q.lineTo(3.0f, 3.0f);
        gy.B(q, 18.19f, 18.19f, 19.78f, 22.61f);
        q.moveTo(16.17f, 19.0f);
        q.lineTo(13.0f, 15.83f);
        q.verticalLineTo(19.0f);
        q.horizontalLineTo(16.17f);
        q.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, q.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noDrinks = build;
        build.getClass();
        return build;
    }
}

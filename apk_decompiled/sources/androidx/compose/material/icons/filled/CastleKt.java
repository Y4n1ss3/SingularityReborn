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
import defpackage.af0;
import defpackage.fc;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CastleKt {
    private static ImageVector _castle;

    public static final ImageVector getCastle(Icons.Filled filled) {
        ImageVector imageVector = _castle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Castle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(21.0f, 9.0f, 2.0f, -2.0f, 3.0f);
        af0.w(w, -2.0f, 2.0f, -2.0f, 3.0f);
        af0.w(w, -2.0f, 2.0f, -2.0f, 3.0f);
        uf.B(w, 9.0f, 2.0f, 7.0f, 3.0f);
        uf.B(w, 5.0f, 8.0f, 3.0f, 9.0f);
        uf.k(w, 1.0f, 12.0f, 9.0f, -3.0f);
        w.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        w.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        uf.y(w, 3.0f, 9.0f, 9.0f, 21.0f);
        uo.p(w, 11.0f, 12.0f, 9.0f, 9.0f);
        uo.r(w, 2.0f, 12.0f, 15.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.h(w, -2.0f, 9.0f, 2.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _castle = build;
        build.getClass();
        return build;
    }
}

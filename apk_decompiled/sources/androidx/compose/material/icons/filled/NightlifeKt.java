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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightlifeKt {
    private static ImageVector _nightlife;

    public static final ImageVector getNightlife(Icons.Filled filled) {
        ImageVector imageVector = _nightlife;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Nightlife", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(1.0f, 5.0f, 14.0f, -6.0f, 9.0f);
        uf.s(i, 4.0f, 2.0f, 2.0f, 5.0f);
        kf0.z(i, -2.0f, 2.0f, -4.0f);
        uo.l(i, 1.0f, 5.0f, 10.1f, 9.0f);
        i.lineToRelative(1.4f, -2.0f);
        i.horizontalLineTo(4.49f);
        i.lineToRelative(1.4f, 2.0f);
        i.horizontalLineTo(10.1f);
        i.close();
        k4.C(i, 17.0f, 5.0f, 5.0f, 3.0f);
        kf0.x(i, -3.0f, 9.0f, 0.0f);
        i.curveToRelative(0.0f, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        i.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        i.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        i.curveToRelative(0.35f, 0.0f, 0.69f, 0.06f, 1.0f, 0.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 17.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightlife = build;
        build.getClass();
        return build;
    }
}

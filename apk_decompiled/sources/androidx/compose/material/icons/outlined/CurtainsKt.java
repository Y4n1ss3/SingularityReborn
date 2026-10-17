package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CurtainsKt {
    private static ImageVector _curtains;

    public static final ImageVector getCurtains(Icons.Outlined outlined) {
        ImageVector imageVector = _curtains;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Curtains", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(20.0f, 19.0f, 3.0f, 4.0f, 16.0f);
        uf.k(f, 2.0f, 2.0f, 20.0f, -2.0f);
        k4.w(f, 20.0f, 18.0f, 10.86f);
        f.curveToRelative(-2.05f, -0.58f, -3.64f, -2.93f, -3.94f, -5.86f);
        bv.s(f, 18.0f, 10.86f, 15.81f, 12.0f);
        f.curveToRelative(-2.04f, 1.35f, -3.5f, 3.94f, -3.76f, 7.0f);
        f.horizontalLineToRelative(-0.09f);
        f.curveToRelative(-0.26f, -3.06f, -1.72f, -5.65f, -3.76f, -7.0f);
        f.curveToRelative(2.04f, -1.35f, 3.5f, -3.94f, 3.76f, -7.0f);
        f.horizontalLineToRelative(0.09f);
        f.curveTo(12.31f, 8.06f, 13.77f, 10.65f, 15.81f, 12.0f);
        f.close();
        f.moveTo(9.94f, 5.0f);
        f.curveTo(9.64f, 7.93f, 8.05f, 10.27f, 6.0f, 10.86f);
        bv.z(f, 5.0f, 9.94f, 6.0f, 13.14f);
        f.curveToRelative(2.05f, 0.58f, 3.64f, 2.93f, 3.94f, 5.86f);
        bv.s(f, 6.0f, 13.14f, 14.06f, 19.0f);
        f.curveToRelative(0.3f, -2.93f, 1.89f, -5.27f, 3.94f, -5.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.e(f, 19.0f, 14.06f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _curtains = build;
        build.getClass();
        return build;
    }
}

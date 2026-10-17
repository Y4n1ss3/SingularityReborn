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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddLinkKt {
    private static ImageVector _addLink;

    public static final ImageVector getAddLink(Icons.Outlined outlined) {
        ImageVector imageVector = _addLink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddLink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(8.0f, 11.0f, 8.0f, 2.0f, 8.0f);
        k4.B(d, 11.0f, 20.1f, 12.0f, 22.0f);
        d.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        kf0.x(d, -4.0f, 1.9f, 4.0f);
        d.curveTo(18.71f, 8.9f, 20.1f, 10.29f, 20.1f, 12.0f);
        d.close();
        d.moveTo(3.9f, 12.0f);
        d.curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        uo.f(d, 4.0f, 7.0f, 7.0f);
        d.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        d.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        k4.k(d, 4.0f, -1.9f, 7.0f);
        d.curveTo(5.29f, 15.1f, 3.9f, 13.71f, 3.9f, 12.0f);
        r6.B(d, 19.0f, 12.0f, -2.0f, 3.0f);
        af0.v(d, -3.0f, 2.0f, 3.0f, 3.0f);
        af0.v(d, 2.0f, -3.0f, 3.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(d, -3.0f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addLink = build;
        build.getClass();
        return build;
    }
}

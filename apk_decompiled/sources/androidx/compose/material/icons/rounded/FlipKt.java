package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlipKt {
    private static ImageVector _flip;

    public static final ImageVector getFlip(Icons.Rounded rounded) {
        ImageVector imageVector = _flip;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flip", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(15.0f, 21.0f, 2.0f, -2.0f, -2.0f);
        bv.m(n, 2.0f, 19.0f, 9.0f, 2.0f);
        r6.m(n, 21.0f, 7.0f, -2.0f, 2.0f);
        n.moveTo(3.0f, 5.0f);
        n.verticalLineToRelative(14.0f);
        n.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        n.horizontalLineToRelative(3.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        n.lineTo(6.0f, 19.0f);
        n.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        n.lineTo(5.0f, 6.0f);
        n.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        n.horizontalLineToRelative(2.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        n.lineTo(5.0f, 3.0f);
        n.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        uo.C(n, 19.0f, 3.0f, 2.0f, 2.0f);
        n.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        n.close();
        n.moveTo(12.0f, 23.0f);
        n.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        n.lineTo(13.0f, 2.0f);
        n.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        n.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        n.verticalLineToRelative(20.0f);
        n.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        r6.B(n, 19.0f, 17.0f, 2.0f, -2.0f);
        fc.x(n, -2.0f, 2.0f, 15.0f, 5.0f);
        uo.n(n, 2.0f, 17.0f, 3.0f, -2.0f);
        bv.m(n, 2.0f, 19.0f, 13.0f, 2.0f);
        r6.p(n, -2.0f, -2.0f, 2.0f);
        n.moveTo(19.0f, 21.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(n, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flip = build;
        build.getClass();
        return build;
    }
}

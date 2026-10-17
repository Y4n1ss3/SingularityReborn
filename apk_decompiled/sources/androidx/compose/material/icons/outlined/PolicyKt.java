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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PolicyKt {
    private static ImageVector _policy;

    public static final ImageVector getPolicy(Icons.Outlined outlined) {
        ImageVector imageVector = _policy;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Policy", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(12.0f, 1.0f, 3.0f, 5.0f, 6.0f);
        s.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        s.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        bv.k(s, 5.0f, 12.0f, 1.0f);
        s.moveTo(19.0f, 11.0f);
        s.curveToRelative(0.0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f);
        s.lineToRelative(-1.45f, -1.45f);
        s.curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f);
        s.curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0.0f);
        s.curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f);
        s.curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f);
        s.lineToRelative(1.72f, 1.72f);
        s.curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f);
        s.curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f);
        s.verticalLineTo(6.3f);
        s.lineToRelative(7.0f, -3.11f);
        uf.x(s, 7.0f, 3.11f, 11.0f);
        s.moveTo(12.0f, 15.0f);
        s.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        s.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        s.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(s, 13.66f, 15.0f, 12.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _policy = build;
        build.getClass();
        return build;
    }
}

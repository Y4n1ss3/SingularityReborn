package androidx.compose.material.icons.twotone;

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
import defpackage.bv;
import defpackage.er;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FollowTheSignsKt {
    private static ImageVector _followTheSigns;

    public static final ImageVector getFollowTheSigns(Icons.TwoTone twoTone) {
        ImageVector imageVector = _followTheSigns;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FollowTheSigns", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(17.64f, 7.75f, 6.0f, -3.51f, 4.5f);
        bv.w(c, 3.51f, 2.75f, 2.49f, 2.5f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 17.64f, 7.75f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.12f, 5.25f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(8.02f, 5.25f, 9.12f, 5.25f);
        k4.x(b, 5.38f, 8.65f, -2.75f, 14.1f);
        b.horizontalLineToRelative(2.1f);
        b.lineToRelative(1.75f, -8.0f);
        r6.A(b, 2.15f, 2.0f, 6.0f, 2.0f);
        b.verticalLineTo(15.2f);
        b.lineToRelative(-2.05f, -2.05f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveToRelative(1.3f, 1.6f, 3.25f, 2.6f, 5.45f, 2.6f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f);
        b.lineTo(9.32f, 6.7f);
        b.curveToRelative(-0.35f, -0.6f, -1.0f, -0.95f, -1.7f, -0.95f);
        b.curveToRelative(-0.25f, 0.0f, -0.5f, 0.05f, -0.75f, 0.15f);
        af0.m(b, 1.62f, 8.05f, 4.7f, 2.0f);
        b.verticalLineTo(9.4f);
        b.lineTo(5.38f, 8.65f);
        bv.y(b, 12.62f, 1.75f, 7.0f, 3.75f);
        r6.D(b, 14.0f, 1.5f, -14.0f, 3.75f);
        kf0.n(b, -7.0f, 12.62f, 17.64f, 7.75f);
        gy.z(b, 6.0f, -3.51f, 4.5f, 3.51f);
        b.verticalLineTo(2.75f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 2.49f, 2.5f, 17.64f, 7.75f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _followTheSigns = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFollowTheSigns$annotations(Icons.TwoTone twoTone) {
    }
}

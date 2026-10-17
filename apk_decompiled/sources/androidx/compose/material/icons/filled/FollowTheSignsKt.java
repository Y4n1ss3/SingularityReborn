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
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FollowTheSignsKt {
    private static ImageVector _followTheSigns;

    public static final ImageVector getFollowTheSigns(Icons.Filled filled) {
        ImageVector imageVector = _followTheSigns;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FollowTheSigns", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveTo(8.4f, 5.5f, 9.5f, 5.5f);
        k4.r(b, 5.75f, 8.9f, 3.0f, 23.0f);
        b.horizontalLineToRelative(2.1f);
        b.lineToRelative(1.75f, -8.0f);
        af0.m(b, 9.0f, 17.0f, 6.0f, 2.0f);
        b.verticalLineToRelative(-7.55f);
        b.lineTo(8.95f, 13.4f);
        b.lineToRelative(0.6f, -3.0f);
        b.curveTo(10.85f, 12.0f, 12.8f, 13.0f, 15.0f, 13.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-1.85f, 0.0f, -3.45f, -1.0f, -4.35f, -2.45f);
        b.lineTo(9.7f, 6.95f);
        b.curveTo(9.35f, 6.35f, 8.7f, 6.0f, 8.0f, 6.0f);
        b.curveTo(7.75f, 6.0f, 7.5f, 6.05f, 7.25f, 6.15f);
        fc.t(b, 2.0f, 8.3f, 13.0f, 2.0f);
        b.verticalLineTo(9.65f);
        b.lineTo(5.75f, 8.9f);
        bv.y(b, 13.0f, 2.0f, 7.0f, 3.75f);
        bv.B(b, 14.0f, 1.5f, 9.0f, 22.0f);
        bv.z(b, 2.0f, 13.0f, 18.01f, 8.0f);
        bv.A(b, 6.25f, 14.5f, -1.5f, 3.51f);
        b.verticalLineTo(3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 2.49f, 2.5f, 18.01f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _followTheSigns = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFollowTheSigns$annotations(Icons.Filled filled) {
    }
}

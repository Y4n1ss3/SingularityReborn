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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DriveFileMoveRtlKt {
    private static ImageVector _driveFileMoveRtl;

    public static final ImageVector getDriveFileMoveRtl(Icons.TwoTone twoTone) {
        ImageVector imageVector = _driveFileMoveRtl;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DriveFileMoveRtl", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(11.17f, 8.0f, -2.0f, -2.0f, 4.0f);
        uf.y(u, 12.0f, 16.0f, 8.0f, 11.17f);
        k4.C(u, 16.0f, 14.0f, -4.0f, 3.0f);
        u.lineToRelative(-4.0f, -4.0f);
        r6.A(u, 4.0f, -4.0f, 3.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(u, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 6.0f, -8.0f, -2.0f, -2.0f);
        i.horizontalLineTo(4.0f);
        i.curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(8.0f);
        i.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        c21.d(i, 20.0f, 18.0f, 4.0f, 6.0f);
        r6.t(i, 5.17f, 2.0f, 2.0f, 20.0f);
        bv.t(i, 18.0f, 12.0f, 17.0f);
        i.lineToRelative(-4.0f, -4.0f);
        r6.A(i, 4.0f, -4.0f, 3.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(i, 2.0f, -4.0f, 17.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveFileMoveRtl = build;
        build.getClass();
        return build;
    }
}

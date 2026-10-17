package androidx.compose.material.icons.automirrored.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DriveFileMoveKt {
    private static ImageVector _driveFileMove;

    public static final ImageVector getDriveFileMove(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _driveFileMove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.DriveFileMove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        i.horizontalLineToRelative(5.17f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineTo(11.17f, 8.0f);
        i.horizontalLineTo(20.0f);
        i.verticalLineTo(18.0f);
        i.close();
        k4.A(i, 12.16f, 12.0f, 8.0f, 2.0f);
        i.horizontalLineToRelative(4.16f);
        i.lineToRelative(-1.59f, 1.59f);
        i.lineTo(11.99f, 17.0f);
        i.lineTo(16.0f, 13.01f);
        i.lineTo(11.99f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -1.41f, 1.41f, 12.16f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveFileMove = build;
        build.getClass();
        return build;
    }
}

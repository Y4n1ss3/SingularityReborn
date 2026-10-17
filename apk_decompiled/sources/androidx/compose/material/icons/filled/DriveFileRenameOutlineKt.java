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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DriveFileRenameOutlineKt {
    private static ImageVector _driveFileRenameOutline;

    public static final ImageVector getDriveFileRenameOutline(Icons.Filled filled) {
        ImageVector imageVector = _driveFileRenameOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DriveFileRenameOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.41f, 5.8f, 17.2f, 4.59f);
        i.curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0.0f);
        i.lineToRelative(-2.68f, 2.68f);
        fc.t(i, 3.0f, 15.96f, 20.0f, 4.04f);
        i.lineToRelative(8.74f, -8.74f);
        i.lineToRelative(2.63f, -2.63f);
        i.curveToRelative(0.79f, -0.78f, 0.79f, -2.05f, 0.0f, -2.83f);
        uo.q(i, 6.21f, 18.0f, 5.0f, -1.21f);
        i.lineToRelative(8.66f, -8.66f);
        gy.B(i, 1.21f, 1.21f, 6.21f, 18.0f);
        i.moveTo(11.0f, 20.0f);
        r6.q(i, 4.0f, -4.0f, 6.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _driveFileRenameOutline = build;
        build.getClass();
        return build;
    }
}

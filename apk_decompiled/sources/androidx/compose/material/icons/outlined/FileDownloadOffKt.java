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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileDownloadOffKt {
    private static ImageVector _fileDownloadOff;

    public static final ImageVector getFileDownloadOff(Icons.Outlined outlined) {
        ImageVector imageVector = _fileDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.FileDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(18.0f, 15.17f, 15.0f, 2.0f, 2.17f);
        uo.l(c, 18.0f, 15.17f, 15.41f, 12.59f);
        c.lineTo(17.0f, 11.0f);
        c.lineToRelative(-1.41f, -1.41f);
        r6.C(c, 14.0f, 11.17f, 15.41f, 12.59f);
        kp0.t(c, 13.0f, 10.17f, 4.0f, -2.0f);
        kf0.t(c, 4.17f, 13.0f, 10.17f);
        c.moveTo(21.19f, 21.19f);
        c.lineToRelative(-1.78f, -1.78f);
        c.lineTo(2.81f, 2.81f);
        c.lineTo(1.39f, 4.22f);
        c.lineToRelative(6.19f, 6.19f);
        c.lineTo(7.0f, 11.0f);
        c.lineToRelative(5.0f, 5.0f);
        c.lineToRelative(0.59f, -0.59f);
        r6.w(c, 15.17f, 18.0f, 6.0f, -3.0f);
        c.horizontalLineTo(4.0f);
        c.verticalLineToRelative(3.0f);
        c.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        c.horizontalLineToRelative(11.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, 2.61f, 2.61f, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileDownloadOff = build;
        build.getClass();
        return build;
    }
}

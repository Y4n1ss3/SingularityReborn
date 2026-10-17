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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileDownloadOffKt {
    private static ImageVector _fileDownloadOff;

    public static final ImageVector getFileDownloadOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fileDownloadOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FileDownloadOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(k4.e(13.0f, 5.0f, -2.0f, 0.0f), 0.0f, 3.17f, 2.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(11.0f, 8.17f, -2.0f, -2.0f, 3.0f);
        kf0.x(j, 6.0f, 6.0f, 4.0f);
        j.lineToRelative(-3.59f, 3.59f);
        fc.t(j, 13.0f, 10.17f, 5.0f, -2.0f);
        bv.t(j, 8.17f, 21.19f, 21.19f);
        j.lineTo(2.81f, 2.81f);
        j.lineTo(1.39f, 4.22f);
        j.lineTo(6.17f, 9.0f);
        j.horizontalLineTo(5.0f);
        j.lineToRelative(7.0f, 7.0f);
        j.lineToRelative(0.59f, -0.59f);
        r6.w(j, 15.17f, 18.0f, 5.0f, 2.0f);
        j.horizontalLineToRelative(12.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(j, 2.61f, 2.61f, 21.19f, 21.19f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileDownloadOff = build;
        build.getClass();
        return build;
    }
}

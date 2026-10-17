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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FileOpenKt {
    private static ImageVector _fileOpen;

    public static final ImageVector getFileOpen(Icons.Filled filled) {
        ImageVector imageVector = _fileOpen;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.FileOpen", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        af0.g(d, 15.0f, -8.0f, 5.0f, 8.0f);
        uo.l(d, 14.0f, 2.0f, 13.0f, 9.0f);
        d.verticalLineTo(3.5f);
        d.lineTo(18.5f, 9.0f);
        d.horizontalLineTo(13.0f);
        d.close();
        kp0.t(d, 17.0f, 21.66f, 16.0f, 5.66f);
        gy.C(d, 2.0f, -2.24f, 2.95f, 2.95f);
        d.lineToRelative(-1.41f, 1.41f);
        d.lineTo(19.0f, 19.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(d, 0.0f, 2.24f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fileOpen = build;
        build.getClass();
        return build;
    }
}

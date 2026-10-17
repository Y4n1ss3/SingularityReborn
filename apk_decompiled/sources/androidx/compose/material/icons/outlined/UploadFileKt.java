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
import defpackage.bv;
import defpackage.fc;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UploadFileKt {
    private static ImageVector _uploadFile;

    public static final ImageVector getUploadFile(Icons.Outlined outlined) {
        ImageVector imageVector = _uploadFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.UploadFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.0f, 2.0f, 6.0f);
        d.curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
        d.lineTo(4.0f, 20.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(18.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 8.0f, 14.0f, 2.0f);
        uo.p(d, 18.0f, 20.0f, 6.0f, 4.0f);
        bv.l(d, 7.0f, 5.0f, 5.0f, 20.0f);
        d.moveTo(8.0f, 15.01f);
        d.lineToRelative(1.41f, 1.41f);
        fc.t(d, 11.0f, 14.84f, 19.0f, 2.0f);
        d.verticalLineToRelative(-4.16f);
        d.lineToRelative(1.59f, 1.59f);
        d.lineTo(16.0f, 15.01f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(d, 12.01f, 11.0f, 8.0f, 15.01f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _uploadFile = build;
        build.getClass();
        return build;
    }
}

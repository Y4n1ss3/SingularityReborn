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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachFileKt {
    private static ImageVector _attachFile;

    public static final ImageVector getAttachFile(Icons.TwoTone twoTone) {
        ImageVector imageVector = _attachFile;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AttachFile", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.5f, 23.0f);
        b.curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        kf0.r(b, 6.0f, -1.5f, 11.5f);
        b.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b.verticalLineToRelative(10.5f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        r6.v(b, 6.0f, 10.0f, 9.5f);
        b.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        b.reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f);
        b.verticalLineTo(5.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b.reflectiveCurveTo(7.0f, 2.79f, 7.0f, 5.0f);
        b.verticalLineToRelative(12.5f);
        b.curveToRelative(0.0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachFile = build;
        build.getClass();
        return build;
    }
}

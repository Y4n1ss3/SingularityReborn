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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AttachmentKt {
    private static ImageVector _attachment;

    public static final ImageVector getAttachment(Icons.Filled filled) {
        ImageVector imageVector = _attachment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Attachment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.0f, 12.5f);
        b.curveTo(2.0f, 9.46f, 4.46f, 7.0f, 7.5f, 7.0f);
        b.horizontalLineTo(18.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        b.horizontalLineTo(9.5f);
        b.curveTo(8.12f, 15.0f, 7.0f, 13.88f, 7.0f, 12.5f);
        b.reflectiveCurveTo(8.12f, 10.0f, 9.5f, 10.0f);
        r6.y(b, 17.0f, 2.0f, 9.41f);
        b.curveToRelative(-0.55f, 0.0f, -0.55f, 1.0f, 0.0f, 1.0f);
        b.horizontalLineTo(18.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(7.5f);
        b.curveTo(5.57f, 9.0f, 4.0f, 10.57f, 4.0f, 12.5f);
        b.reflectiveCurveTo(5.57f, 16.0f, 7.5f, 16.0f);
        r6.y(b, 17.0f, 2.0f, 7.5f);
        b.curveTo(4.46f, 18.0f, 2.0f, 15.54f, 2.0f, 12.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachment = build;
        build.getClass();
        return build;
    }
}

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
import defpackage.er;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.Outlined outlined) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssistantDirection", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 1.0f);
        b.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        b.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        b.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        b.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        b.close();
        b.moveTo(12.0f, 21.0f);
        b.curveToRelative(-4.99f, 0.0f, -9.0f, -4.01f, -9.0f, -9.0f);
        b.reflectiveCurveToRelative(4.01f, -9.0f, 9.0f, -9.0f);
        b.reflectiveCurveToRelative(9.0f, 4.01f, 9.0f, 9.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 16.99f, 21.0f, 12.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.73f, 11.42f, 12.54f, 4.2f);
        i.curveToRelative(-0.36f, -0.27f, -0.8f, -0.27f, -1.15f, 0.0f);
        i.lineTo(4.2f, 11.42f);
        i.curveToRelative(-0.27f, 0.36f, -0.27f, 0.8f, 0.0f, 1.16f);
        i.lineToRelative(7.19f, 7.22f);
        i.curveToRelative(0.36f, 0.27f, 0.8f, 0.27f, 1.15f, 0.0f);
        i.lineToRelative(7.19f, -7.22f);
        i.curveTo(20.09f, 12.22f, 20.09f, 11.69f, 19.73f, 11.42f);
        k4.x(i, 13.5f, 14.5f, -1.41f, -1.41f);
        r6.w(i, 13.17f, 12.0f, 10.0f, 3.0f);
        i.horizontalLineTo(8.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(4.17f);
        i.lineToRelative(-1.09f, -1.09f);
        i.lineTo(13.5f, 7.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(i, 17.0f, 11.0f, 13.5f, 14.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getAssistantDirection$annotations(Icons.Outlined outlined) {
    }
}

package androidx.compose.ui.text.platform;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.UrlAnnotation;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class URLSpanCache {
    public static final int $stable = 8;
    private final WeakHashMap<UrlAnnotation, URLSpan> spansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> urlSpansByAnnotation = new WeakHashMap<>();
    private final WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> linkSpansWithListenerByAnnotation = new WeakHashMap<>();

    public final ClickableSpan toClickableSpan(AnnotatedString.Range<LinkAnnotation> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation>, ComposeClickableSpan> weakHashMap = this.linkSpansWithListenerByAnnotation;
        ComposeClickableSpan composeClickableSpan = weakHashMap.get(range);
        if (composeClickableSpan == null) {
            composeClickableSpan = new ComposeClickableSpan(range.getItem());
            weakHashMap.put(range, composeClickableSpan);
        }
        return composeClickableSpan;
    }

    public final URLSpan toURLSpan(AnnotatedString.Range<LinkAnnotation.Url> range) {
        WeakHashMap<AnnotatedString.Range<LinkAnnotation.Url>, URLSpan> weakHashMap = this.urlSpansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(range);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(range.getItem().getUrl());
            weakHashMap.put(range, uRLSpan);
        }
        return uRLSpan;
    }

    public final URLSpan toURLSpan(UrlAnnotation urlAnnotation) {
        WeakHashMap<UrlAnnotation, URLSpan> weakHashMap = this.spansByAnnotation;
        URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
